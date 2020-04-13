package com.individual.Repository;

import java.util.List;

import com.individual.Entity.Product;

public interface ProductRepository {
	
	public List<Product> getAllProduct();

	public List<Product> getProductBySupplier(int id);

}
