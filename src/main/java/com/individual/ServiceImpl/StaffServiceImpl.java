package com.individual.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.individual.Entity.Staff;
import com.individual.Repository.StaffRepository;
import com.individual.Service.StaffService;



@Service
public class StaffServiceImpl implements StaffService {

	private StaffRepository staff;

	@Autowired
	public StaffServiceImpl(StaffRepository staff) {
		this.staff = staff;
		
	}

	@Override
	public Page<Staff> getAll(Pageable pageRequest) {
		return staff.getAll(pageRequest);
	}

	@Override
	public int disableStaff(int id) {
		return staff.disableStaff(id);
	}

	@Override
	public Staff getStaffById(int staffId) {
		return staff.getStaffById(staffId);
	}

	@Override
	public int updateStaff(String fullName, String address, String phoneNum, String dob,int id) {
		return staff.updateStaff(fullName, address, phoneNum, dob, id);
	}

	@Override
	public Staff saveStaff(Staff staf) {
		
		return staff.save(staf);
	}

	@Override
	public Long countStaff() {
		return staff.count();
	}

	@Override
	public Page<Staff> findByFullName(Pageable pageRequest, String fullName) {
		// TODO Auto-generated method stub
		return staff.findByFullName(pageRequest, fullName);
	}


}
