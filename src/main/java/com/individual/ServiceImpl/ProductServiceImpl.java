package com.individual.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.individual.Entity.Product;
import com.individual.Repository.ProductRepository;
import com.individual.Service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}


}
