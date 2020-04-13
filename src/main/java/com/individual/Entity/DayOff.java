package com.individual.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "day_off")
public class DayOff {

	@Id
	@GeneratedValue
	@Column(name = "day_off_id")
	private int id;
	  
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "staff_id",nullable = false)
	private Staff staff;
	
	@Column(name = "day_off")
	private String dayOff;
	
	@Column(name ="description")
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public String getDayOff() {
		return dayOff;
	}

	public void setDayOff(String dayOff) {
		this.dayOff = dayOff;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
