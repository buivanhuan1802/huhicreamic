package com.individual.Repository;

import org.springframework.stereotype.Repository;

import com.individual.Entity.Supplier;

@Repository
public interface SupplierRepository {

	public Supplier getSupplierById(int id);
	
}
