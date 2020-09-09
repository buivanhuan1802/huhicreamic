package com.individual.Repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.individual.Entity.ProductDetail;

@Repository
public interface ProductDetailRepository {

	public List<ProductDetail> getProductDetailbyProductId(int productId);

	public ProductDetail getProductDetailById(int id);
}
