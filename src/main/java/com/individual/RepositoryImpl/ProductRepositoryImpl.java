package com.individual.RepositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.individual.Entity.Product;
import com.individual.Repository.ProductRepository;


@Repository
@Transactional
public class ProductRepositoryImpl implements ProductRepository{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Product> getAllProduct() {
		return entityManager.createQuery("SELECT c FROM Product c", Product.class).getResultList();
	}

	@Override
	public List<Product> getProductBySupplier(int id) {


		return null;
	}
	
}
