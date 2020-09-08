package com.individual.Controller.Admin;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.individual.ServiceImpl.AppUserServiceImpl;
import com.individual.ServiceImpl.AreaServiceImpl;
import com.individual.ServiceImpl.BestSellerServiceImpl;
import com.individual.ServiceImpl.ProductServiceImpl;
import com.individual.ServiceImpl.StaffServiceImpl;
import com.individual.Utils.CommonFunctions;
import com.individual.Utils.CommonValidation;

import com.individual.Entity.Area;
import com.individual.Entity.BestSeller;
import com.individual.Entity.Product;


@Controller
public class CommonAdminController {

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
	CommonFunctions common;
	@Autowired
	CommonValidation validation;

	@RequestMapping(value = { "/admin/dashboard" }, method = RequestMethod.GET)
	public String DashBoardProcess(Model model, @RequestParam(name = "areaid", required = false) String areaid,
			@RequestParam(name = "year", required = false) String year,HttpServletRequest request) {
		System.out.println(request.getHeader("Authorization")+"123456");
		List<Product> listProduct = product.getAllProduct();
		List<Area> listArea = area.getListArea();
		int selectedArea = validation.isEmtyString(areaid) ? listArea.get(0).getId()
				: validation.isInteger(areaid) ? Integer.parseInt(areaid) : listArea.get(0).getId();
		List<BestSeller> listBestSellerByArea = bestSeller.getTopBestSellerByArea(selectedArea);
		List<BestSeller> listBestseller = bestSeller.getTopBestSeller(common.getCurrentMonth());
		model.addAttribute("listProduct", listProduct);
		model.addAttribute("listArea", listArea);
		model.addAttribute("bestSeller", listBestseller);
		model.addAttribute("listBestSellerByArea", listBestSellerByArea);
		model.addAttribute("selectedArea", selectedArea);
		return "admin/dashboard";
	}

	@RequestMapping(value = { "/admin/dashboard" }, method = RequestMethod.POST)
	public String DashBoardPost() {
		
		return "admin/dashboard";
	}
}
