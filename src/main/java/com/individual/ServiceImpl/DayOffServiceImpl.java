package com.individual.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.individual.Entity.DayOff;
import com.individual.Repository.DayOffRepository;
import com.individual.Service.DayOffService;

@Service
public class DayOffServiceImpl implements DayOffService{

	private DayOffRepository dayOff;
	
	@Autowired
	public DayOffServiceImpl(DayOffRepository dayOff) {
		this.dayOff = dayOff;
		// TODO Auto-generated constructor stub
	}
	@Override
	public Page<DayOff> getDayOff( Pageable pageRequest) {
		// TODO Auto-generated method stub

		return dayOff.getDayOff(pageRequest);
	}
	

}
