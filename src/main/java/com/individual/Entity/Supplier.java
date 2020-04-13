package com.individual.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "supplier")
public class Supplier implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "supplier_id", nullable = false)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "phone_num")
	private String phoneNum;

	@Column(name = "disable")
	private boolean disable;

	@OneToMany(mappedBy = "supplier", fetch = FetchType.LAZY)
	private List<PurchaseOrder> listPurChaseOrder;

	@OneToOne(fetch = FetchType.LAZY,mappedBy = "supplier")
	private AccountsLiabilities accountLiabilities;
	

	public AccountsLiabilities getAccountLiabilities() {
		return accountLiabilities;
	}

	public void setAccountLiabilities(AccountsLiabilities accountLiabilities) {
		this.accountLiabilities = accountLiabilities;
	}

	public List<PurchaseOrder> getListPurChaseOrder() {
		return listPurChaseOrder;
	}

	public void setListPurChaseOrder(List<PurchaseOrder> listPurChaseOrder) {
		this.listPurChaseOrder = listPurChaseOrder;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
