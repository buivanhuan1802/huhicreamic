package com.individual.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminAreaController {


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
