package com.individual.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "best_seller")
public class BestSeller implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id",nullable = false)
	private Product product;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "area_id")
	private Area area;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "month")
	private String month;

	
	
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Area getAre() {
		return area;
	}

	public void setAre(Area are) {
		this.area = are;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
