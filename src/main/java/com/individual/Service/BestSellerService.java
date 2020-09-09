package com.individual.Service;

import java.util.List;

import com.individual.Entity.BestSeller;

public interface BestSellerService {

	 List<BestSeller> getTopBestSeller(String month);
	
	 List<BestSeller> getTopBestSellerByArea(int areaId);
}
