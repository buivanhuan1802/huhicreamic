package com.individual.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "debt_receivables_detail")
public class DebtReceivablesDetail {
	
	@Id
	@GeneratedValue
	@Column(name = "detail_id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY,targetEntity = DebtReceivables.class)
	@JoinColumn(name = "debt_receivables_id",nullable = false)
	private DebtReceivables debtReceivables;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "invoice_id",nullable = false)
	private Invoice invoice;
	
	@Column(name = "debt_paid")
	private double debtPaid;
	
	@Column(name = "debt_remaining")
	private double debtRemaining;
	
	@Column(name = "description")
	private String description;

}
