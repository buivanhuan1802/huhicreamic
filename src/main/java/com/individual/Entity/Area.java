package com.individual.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "area")
public class Area implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "area_id")
	private int id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "disable")
	private boolean disable;

	@OneToOne(mappedBy = "area",fetch = FetchType.EAGER)
	private BestSeller bestSeller;
	
	
	public BestSeller getBestSeller() {
		return bestSeller;
	}

	public void setBestSeller(BestSeller bestSeller) {
		this.bestSeller = bestSeller;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}
	
}
