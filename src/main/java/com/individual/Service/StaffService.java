package com.individual.Service;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.individual.Entity.Staff;

public interface StaffService {
	 Page<Staff> getAll(Pageable pageRequest);
	 int disableStaff(int id);
	 Staff getStaffById(int staffid);
	 int updateStaff(String fullName,String address,String phoneNum,String dob,int id);
	 Long countStaff();
	 Staff saveStaff(Staff staff);
	 Page<Staff> findByFullName(Pageable pageRequest,String fullName);
}
