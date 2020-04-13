package com.individual.Entity;


import java.util.List;

import javax.persistence.CascadeType;
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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "invoice",uniqueConstraints = { //
		@UniqueConstraint(name = "invoice_UK", columnNames = { "customer_id", "staff_id" }) })
public class Invoice {

    @Id
    @GeneratedValue
    @Column(name = "invoice_id", nullable = false)
    private Long invoiceId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staff_id", nullable = false)
    private Staff staff;
    
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "shipper_id")
    private Shipper shipper;
    
    @Column(name ="date_created",nullable = false)
    private String dateCreated;
    
    @Column(name="date_delivery",nullable = false)
    private String dateDelivery;
    
    @Column(name="total_amount",nullable = false)
    private double totalAmount;
    
    @Column(name="note")
    private String note;
    
    @Column(name="status")
    private int status;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "invoice")
    private List<InvoiceDetail> listInvoiceDetail;
	public Long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Shipper getShipper() {
		return shipper;
	}

	public void setShipper(Shipper shipper) {
		this.shipper = shipper;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateDelivery() {
		return dateDelivery;
	}

	public void setDateDelivery(String dateDelivery) {
		this.dateDelivery = dateDelivery;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
    
    
    
}
