package com.individual.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_order")
public class PurchaseOrder implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "purchase_order_id",nullable = false)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supplier_id",nullable = false)
	private Supplier supplier;
	
	@Column(name = "date_purchase")
	private String datePurchase;
	
	@Column(name = "total_amount")
	private double totalAmount;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "purchaseOrder")
	private List<PurchaseOrderDetail> listPurchaseDetail;
	
	@OneToOne(mappedBy = "purchaseOrder",fetch = FetchType.LAZY)
	private AccountsLiabilitiesDetail accountsLiabilitiesDetail;
	
	
	public List<PurchaseOrderDetail> getListPurchaseDetail() {
		return listPurchaseDetail;
	}

	public void setListPurchaseDetail(List<PurchaseOrderDetail> listPurchaseDetail) {
		this.listPurchaseDetail = listPurchaseDetail;
	}

	public AccountsLiabilitiesDetail getAccountsLiabilitiesDetail() {
		return accountsLiabilitiesDetail;
	}

	public void setAccountsLiabilitiesDetail(AccountsLiabilitiesDetail accountsLiabilitiesDetail) {
		this.accountsLiabilitiesDetail = accountsLiabilitiesDetail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public String getDatePurchase() {
		return datePurchase;
	}

	public void setDatePurchase(String datePurchase) {
		this.datePurchase = datePurchase;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
