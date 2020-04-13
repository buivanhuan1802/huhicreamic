package com.individual.Controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	@RequestMapping(value = { "/admin/dashboard" }, method = RequestMethod.GET)
	public String DashBoard() {
		return "admin/dashboard";
	}

	@RequestMapping(value = { "/admin/warehouser-view" }, method = RequestMethod.GET)
	public String WarehouseGoodsReceipt() {
		return "admin/warehouse-view";
	}

	@RequestMapping(value = { "/admin/warehouser-inventoryreport" }, method = RequestMethod.GET)
	public String WarehouseInventoryReport() {
		return "admin/warehouse-inventoryreport";
	}
	@RequestMapping(value = { "/admin/warehouser-goodsreceiptreport" }, method = RequestMethod.GET)
	public String WarehouseGoodsReceipReport() {
		return "admin/warehouse-goodsreceiptreport";
	}
	@RequestMapping(value = { "/admin/staff-createnew" }, method = RequestMethod.GET)
	public String CreateNewStaff() {
		return "admin/staff-createnew";
	}
	@RequestMapping(value = { "/admin/staff-viewall" }, method = RequestMethod.GET)
	public String ViewAllStaff() {
		return "admin/staff-viewall";
	}
	@RequestMapping(value = { "/admin/staff-profile" }, method = RequestMethod.GET)
	public String StaffProfile() {
		return "admin/staff-profile";
	}

	@RequestMapping(value = { "/admin/staff-edit" }, method = RequestMethod.GET)
	public String EditStaff() {
		return "admin/staff-view";
	}

	@RequestMapping(value = { "/admin/staff-delete" }, method = RequestMethod.GET)
	public String DeleteStaff() {
		return "admin/staff-view";
	}

	@RequestMapping(value = { "/admin/staff-salaryreport" }, method = RequestMethod.GET)
	public String StaffSalaryReport() {
		return "admin/staff-salaryreport";
	}

	@RequestMapping(value = { "/admin/staff-evaluation" }, method = RequestMethod.GET)
	public String StaffEvaluation() {
		return "admin/staff-evaluation";
	}

	@RequestMapping(value = { "/admin/invoice-view" }, method = RequestMethod.GET)
	public String ViewInvoice(@RequestParam(name = "status",required = true) String status) {
		return "admin/invoice-view";
	}

	@RequestMapping(value = { "/admin/invoice-edit" }, method = RequestMethod.GET)
	public String EditInvoice() {
		return "admin/invoice-edit";
	}

	@RequestMapping(value = { "/admin/debt-receivables" }, method = RequestMethod.GET)
	public String DebtReceivables() {
		return "admin/debt-receivables";
	}

	@RequestMapping(value = { "/admin/debt-liabilities" }, method = RequestMethod.GET)
	public String DebtLiabilities() {
		return "admin/debt-liabilities";
	}

	@RequestMapping(value = { "/admin/debt-report" }, method = RequestMethod.GET)
	public String DebtReport() {
		return "admin/debt-report";
	}

	@RequestMapping(value = { "/admin/area-createnew" }, method = RequestMethod.GET)
	public String CreateNewArea() {
		return "admin/area-createnew";
	}

	@RequestMapping(value = { "/admin/area-view" }, method = RequestMethod.GET)
	public String ViewArea() {
		return "admin/area-view";
	}

	@RequestMapping(value = { "/admin/area-edit" }, method = RequestMethod.GET)
	public String EditArea() {
		return "admin/area-view";
	}

	@RequestMapping(value = { "/admin/area-delete" }, method = RequestMethod.GET)
	public String DeleteArea() {
		return "admin/area-view";
	}
}
