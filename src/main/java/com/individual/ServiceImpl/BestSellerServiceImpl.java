package com.individual.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.individual.Entity.BestSeller;
import com.individual.Repository.BestSellerRepository;
import com.individual.Service.BestSellerService;

@Service
@Transactional
public class BestSellerServiceImpl implements BestSellerService{

	private BestSellerRepository bestSeller;
	
	@Autowired
	 public BestSellerServiceImpl(BestSellerRepository bestSeller) {
		this.bestSeller = bestSeller;
	}
	@Override
	public List<BestSeller> getTopBestSeller(String month) {
		return bestSeller.getTopBestSeller(month);
	}
	@Override
	public List<BestSeller> getTopBestSellerByArea(int areaId) {
		return bestSeller.getTopBestSellerByArea(areaId);
	}

	
}
