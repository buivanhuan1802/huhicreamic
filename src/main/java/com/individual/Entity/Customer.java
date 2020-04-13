package com.individual.Entity;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue
	@Column(name = "customer_id", nullable = false)
	private Long customerId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "area_id", nullable = false)
	private Area area;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone_num")
	private String phoneNum;
	
	@Column(name="disable")
	private boolean disable;

	@OneToMany(mappedBy = "customer",fetch = FetchType.LAZY,targetEntity = Invoice.class)
	private List<Invoice> listInvoice;
	
	public List<Invoice> getListInvoice() {
		return listInvoice;
	}

	public void setListInvoice(List<Invoice> listInvoice) {
		this.listInvoice = listInvoice;
	}

	public Long getInvoiceId() {
		return customerId;
	}

	public void setInvoiceId(Long customerId) {
		this.customerId = customerId;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}
	
	

}
