package com.individual.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="accounts_liabilities")
public class AccountsLiabilities implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "accounts_liabilities_id",nullable = false)
	private int accountsLiabilitiesId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supplier_id",nullable = false)
	private Supplier supplier;
	
	@Column(name = "total_amount",nullable = false)
	private double totalAmount;

	@OneToMany(mappedBy="accountLiabilities",fetch = FetchType.LAZY)
	private List<AccountsLiabilitiesDetail> listAccountsLiabilitiesDetail;
	
	public int getAccountsLiabilitiesId() {
		return accountsLiabilitiesId;
	}

	public void setAccountsLiabilitiesId(int accountsLiabilitiesId) {
		this.accountsLiabilitiesId = accountsLiabilitiesId;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<AccountsLiabilitiesDetail> getListAccountsLiabilitiesDetail() {
		return listAccountsLiabilitiesDetail;
	}

	public void setListAccountsLiabilitiesDetail(List<AccountsLiabilitiesDetail> listAccountsLiabilitiesDetail) {
		this.listAccountsLiabilitiesDetail = listAccountsLiabilitiesDetail;
	}

	
	
	
	
}
