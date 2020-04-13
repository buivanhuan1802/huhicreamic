package com.individual.Repository;

import java.util.List;

import com.individual.Entity.ProductDetail;

public interface ProductDetailRepository {

	public List<ProductDetail> getProductDetailbyProductId(int productId);

	public ProductDetail getProductDetailById(int id);
}
