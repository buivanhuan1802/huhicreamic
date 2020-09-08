package com.individual.Controller.Admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.individual.Entity.AppUser;
import com.individual.Entity.DayOff;
import com.individual.Entity.Role;
import com.individual.Entity.Staff;
import com.individual.Entity.UserRole;
import com.individual.ServiceImpl.AppRoleServiceImpl;
import com.individual.ServiceImpl.AppUserServiceImpl;
import com.individual.ServiceImpl.AreaServiceImpl;
import com.individual.ServiceImpl.BestSellerServiceImpl;
import com.individual.ServiceImpl.DayOffServiceImpl;
import com.individual.ServiceImpl.ProductServiceImpl;
import com.individual.ServiceImpl.StaffServiceImpl;
import com.individual.ServiceImpl.UserRoleServiceImpl;
import com.individual.Utils.CommonConstant;
import com.individual.Utils.CommonFunctions;
import com.individual.Utils.CommonValidation;
import com.individual.Utils.EncrytedPasswordUtils;

@Controller
public class AdminStaffController {

	@Autowired
	ProductServiceImpl product;
	@Autowired
	AreaServiceImpl area;

	@Autowired
	BestSellerServiceImpl bestSeller;

	@Autowired
	AppUserServiceImpl appUser;

	@Autowired
	StaffServiceImpl staff;

	@Autowired
	UserRoleServiceImpl userRole;

	@Autowired
	DayOffServiceImpl dayOff;
	
	CommonFunctions common = new CommonFunctions();
	CommonValidation validation = new CommonValidation();
	EncrytedPasswordUtils encrypt = new EncrytedPasswordUtils();

	@RequestMapping(value = { "/admin/staff-createnew" }, method = RequestMethod.GET)
	public String CreateNewStaff() {
		return "admin/staff-createnew";
	}

	@RequestMapping(value = { "/admin/staff-save" }, method = RequestMethod.POST)
	public String SaveUser(@RequestParam(name = "fullname", required = false) String fName,
			@RequestParam(name = "address", required = false) String address,
			@RequestParam(name = "phonenum", required = false) String phoneNum,
			@RequestParam(name = "dob", required = false) String dob,
			@RequestParam(name = "username", required = false) String userName,
			@RequestParam(name = "password", required = false) String password) {
		AppUser x = new AppUser(null, userName, encrypt.encrytePassword(password), true);
		Role role = new Role();
		role.setRoleId(Long.parseLong(2 + ""));
		role.setRoleName(CommonConstant.ROLE_USER);
		UserRole userR = new UserRole(null, x, role);
		appUser.saveUser(x);
		userRole.SaveUserRole(userR);
		Staff st = new Staff();
		st.setDisable(true);
		st.setFullName(fName);
		st.setAddress(address);
		st.setDob(dob);
		st.setFixedSalay(10000000);
		st.setUser(x);
		st.setPhoneNum(phoneNum);
		staff.saveStaff(st);
		return "redirect:/admin/staff-viewall";
	}

	@RequestMapping(value = { "/admin/staff-viewall" }, method = RequestMethod.GET)
	public String ViewAllStaff(Model model,
			@RequestParam(name = "page", defaultValue = "0", required = false) String activePage,
			@RequestParam(name = "message", required = false) String message,
			@RequestParam(name = "fullName", required = false) String fName,
			HttpServletRequest req) {
		Sort sort = Sort.by("id").ascending();
		Pageable page = PageRequest.of(Integer.parseInt(activePage), 5, sort);
		Page<Staff> listAllStaff = null;
		if (validation.isEmtyString(fName)) {
			listAllStaff = staff.getAll(page);
		} else {
			listAllStaff = staff.findByFullName(page, fName + "%");
		}
		if (message != null) {
			model.addAttribute("message", message);
		}
		if (listAllStaff == null || listAllStaff.isEmpty()) {
			model.addAttribute("errorMessage", "Không tìm thấy kết quả phù hợp với ' " + fName + " '");
			return "admin/staff-viewall";
		}
		HttpSession ss = req.getSession();
		if(ss.getAttribute("message") !=null) {
			System.out.print(ss.getAttribute("message"));
			model.addAttribute("message", ss.getAttribute("message"));
			ss.removeAttribute("message");
		}
		int totalPages = listAllStaff.getTotalPages();
		model.addAttribute("listAllStaff", listAllStaff);
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("activePage", activePage);
		return "admin/staff-viewall";
	}

	@RequestMapping(value = { "/admin/staff-profile" }, method = RequestMethod.GET)
	public String StaffProfile(@RequestParam(name = "id", required = true) String staffId, Model model,
			HttpServletRequest req) {
		if (validation.isInteger(staffId)) {
			Staff staffProfile = staff.getStaffById(Integer.parseInt(staffId));
			if (staffProfile != null) {
				model.addAttribute("staff", staffProfile);
				return "admin/staff-profile";
			}
		}
		return "redirect:/admin/staff-viewall";

	}

	@RequestMapping(value = { "/admin/staff-update" }, method = RequestMethod.POST)
	public String UpdateStaff(@RequestParam(name = "fullname", required = true) String fullName,
			@RequestParam(name = "phonenum", required = true) String phoneNum,
			@RequestParam(name = "address", required = true) String address,
			@RequestParam(name = "dob", required = true) String dob,
			@RequestParam(name = "staffid", required = true) String staffId, HttpServletRequest req) {
		HttpSession ss = req.getSession();
		try {
			if (staff.updateStaff(fullName, address, phoneNum, dob, Integer.parseInt(staffId)) == 1) {
				ss.setAttribute("message", "Update Staff Successful !");
				return "redirect:/admin/staff-viewall";
			} else {
				ss.setAttribute("error", "Update Staff Fail !");
				return "redirect:/admin/staff-profile?id=" + staffId;
			}
		} catch (Exception e) {
			ss.setAttribute("error", "Opps Something went Wrong \nUpdate Fail !");
			return "redirect:/admin/staff-profile?id=" + staffId;
		}
	}

	@RequestMapping(value = { "/admin/staff-edit" }, method = RequestMethod.GET)
	public String EditStaff() {
		return "admin/staff-viewall";
	}

	@RequestMapping(value = { "/admin/staff-delete" }, method = RequestMethod.GET)
	public String DeleteStaff(@RequestParam(name = "id", required = true) String staffId) {
		if (staffId != null) {
			if (validation.isInteger(staffId)) {
				Staff deleteStaff = staff.getStaffById(Integer.parseInt(staffId));
				if (appUser.disableUser(deleteStaff.getUser().getUserId()) == 1) {
					if (staff.disableStaff(deleteStaff.getId()) == 1) {
						return "redirect:/admin/staff-viewall";
					}

				}

			}
		}

		return "redirect:/admin/staff-viewall";
	}

	@RequestMapping(value = { "/admin/staff-salaryreport" }, method = RequestMethod.GET)
	public String StaffSalaryReport() {
		return "admin/staff-salaryreport";
	}

	@RequestMapping(value = { "/admin/staff-evaluation" }, method = RequestMethod.GET)
	public String StaffEvaluation(
	    @RequestParam(name = "page",required = true,defaultValue = "0")String activePage,
	    @RequestParam(name = "search",required = false)String search,
	    Model model) {
		//Sort sort = Sort.by("id").descending();
		Pageable page = PageRequest.of(Integer.parseInt(activePage), 5);
		Page<DayOff> listDayOff = null;
		if(search == null || search.equals("")) {
			listDayOff = dayOff.getDayOff(page);
		}
		else {
			//listDayOff = staff.findByFullName(page, search);
		}
		if(listDayOff == null || listDayOff.isEmpty()) {
			model.addAttribute("error", "Không tìm thấy kết quả phù hợp với ' "+ search+" '");
			return "admin/staff-evaluation";
			
		}
		int totalPages = listDayOff.getTotalPages();
		model.addAttribute("listStaff", listDayOff);
		model.addAttribute("activePage",activePage);
		model.addAttribute("totalPages", totalPages);
		return "admin/staff-evaluation";
	}

}
