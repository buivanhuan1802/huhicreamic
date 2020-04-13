package com.individual.Entity;

import java.io.Serializable;
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
@Table(name="staff")
public class Staff implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue
	@Column(name="staff_id")
	private Long id;
	

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id",nullable = false)
	private AppUser user;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="phone_num")
	private String phoneNum;
	
	@Column(name ="address")
	private String address;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="disable")
	private boolean disable;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "staff")
	private List<DayOff> listDayOff;
	
	@OneToOne(mappedBy = "staff",fetch = FetchType.LAZY)
	private Shipper shipper;
	
	
	public List<DayOff> getListDayOff() {
		return listDayOff;
	}

	public void setListDayOff(List<DayOff> listDayOff) {
		this.listDayOff = listDayOff;
	}

	public Shipper getShipper() {
		return shipper;
	}

	public void setShipper(Shipper shipper) {
		this.shipper = shipper;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AppUser getUser() {
		return user;
	}

	public void setUser(AppUser user) {
		this.user = user;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}
}
