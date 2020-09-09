package com.individual.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminWareHouseController {

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
}
