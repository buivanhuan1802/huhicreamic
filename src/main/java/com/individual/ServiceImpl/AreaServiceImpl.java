package com.individual.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.individual.Entity.Area;
import com.individual.Repository.AreaRepository;
import com.individual.Service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{

	private AreaRepository area;
	
	@Autowired
	 public AreaServiceImpl(AreaRepository area) {
		this.area = area;
	}
	@Override
	public List<Area> getListArea() {
		return area.findAll();
	}

}
