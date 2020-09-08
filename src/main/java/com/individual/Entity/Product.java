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
@Table(name = "product")
public class Product implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supplier_id")
	private Supplier supplier;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private Category category;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "disable")
	private boolean disable;
    
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "product")
	private List<ProductDetail> listProductDetail;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "product")
	private List<ProductImage> listImage;
	
	@OneToOne(mappedBy = "product",fetch = FetchType.EAGER)
	private BestSeller bestSeller;
	public List<ProductDetail> getListProductDetail() {
		return listProductDetail;
	}

	public void setListProductDetail(List<ProductDetail> listProductDetail) {
		this.listProductDetail = listProductDetail;
	}

	public List<ProductImage> getListImage() {
		return listImage;
	}

	public void setListImage(List<ProductImage> listImage) {
		this.listImage = listImage;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}
	
	
}
