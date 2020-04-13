package com.individual.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name =  "debt_receivables")
public class DebtReceivables {

	@Id
	@GeneratedValue
	@Column(name = "debt_receivables_id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id",nullable = false)
	private Customer customer;
	
	@Column(name = "total_amount")
	private double totalAmount;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "debtReceivables",targetEntity = DebtReceivablesDetail.class)
	private List<DebtReceivablesDetail> listDebtReceiablesDetail;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	
}
