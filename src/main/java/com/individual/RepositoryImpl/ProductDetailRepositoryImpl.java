package com.individual.RepositoryImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.individual.Entity.ProductDetail;
import com.individual.Repository.ProductDetailRepository;

@Repository
public class ProductDetailRepositoryImpl implements ProductDetailRepository{

	@Override
	public List<ProductDetail> getProductDetailbyProductId(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDetail getProductDetailById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
