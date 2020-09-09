package com.individual.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminDebtController {

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
}
