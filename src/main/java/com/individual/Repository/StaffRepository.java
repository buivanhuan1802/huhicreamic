package com.individual.Repository;



import javax.transaction.Transactional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.individual.Entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>{

	@Query(value = "select s from Staff s")
	Page<Staff> getAll(Pageable pageRequest);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("UPDATE Staff s SET s.disable = 0 WHERE s.id = :id")
	int disableStaff(@Param("id")int id);
	
	@Query("select s from Staff s where s.id =:staffId")
	Staff getStaffById(@Param("staffId")int staffId);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("UPDATE Staff s SET s.fullName =:fullName, s.address =:address, s.phoneNum =:phoneNum , s.dob=:dob WHERE s.id = :id")
	int updateStaff(@Param("fullName") String fullName,
			@Param("address")String address,
			@Param("phoneNum") String phoneNum,
			@Param("dob")String dob,
			@Param("id")int id);
	
	
	@Query("select s from Staff s where s.fullName like %:fullName%")
	Page<Staff> findByFullName(Pageable pageRequest,@Param("fullName")String fullName);
	
}
