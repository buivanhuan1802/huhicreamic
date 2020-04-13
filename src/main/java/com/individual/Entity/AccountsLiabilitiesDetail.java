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
@Table(name = "accounts_liabilities_detail")
public class AccountsLiabilitiesDetail {

	@Id
	@GeneratedValue
	@Column(name = "detail_id",nullable = false)
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "accounts_liabilities_id",nullable = false)
	private AccountsLiabilities accountLiabilities;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "purchase_order_id",nullable = false)
	private PurchaseOrder purchaseOrder;
	
	@Column(name="debt_paid")
	private double debtPaid;
	
	@Column(name = "debt_remaininig")
	private double debtRemaining;
	
	@Column(name = "description")
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AccountsLiabilities getAccountLiabilities() {
		return accountLiabilities;
	}

	public void setAccountLiabilities(AccountsLiabilities accountLiabilities) {
		this.accountLiabilities = accountLiabilities;
	}

	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public double getDebtPaid() {
		return debtPaid;
	}

	public void setDebtPaid(double debtPaid) {
		this.debtPaid = debtPaid;
	}

	public double getDebtRemaining() {
		return debtRemaining;
	}

	public void setDebtRemaining(double debtRemaining) {
		this.debtRemaining = debtRemaining;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
