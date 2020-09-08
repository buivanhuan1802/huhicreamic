package com.individual.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminInvoiceController {

	
	@RequestMapping(value = { "/admin/invoice-view" }, method = RequestMethod.GET)
	public String ViewInvoice(@RequestParam(name = "status", required = true) String status) {
		return "admin/invoice-view";
	}

	@RequestMapping(value = { "/admin/invoice-edit" }, method = RequestMethod.GET)
	public String EditInvoice() {
		return "admin/invoice-edit";
	}
}
