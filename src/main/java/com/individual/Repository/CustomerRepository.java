package com.individual.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.individual.Entity.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Long >{

}
