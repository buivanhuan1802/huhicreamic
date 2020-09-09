package com.individual.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.individual.Entity.BestSeller;

public interface BestSellerRepository extends JpaRepository<BestSeller, Integer> {

	@Query(value = "SELECT * FROM best_seller b WHERE b.month =:month ORDER BY b.quantity ASC Limit 10",nativeQuery = true)
	 List<BestSeller> getTopBestSeller(@Param("month")String month);
	
	@Query(value = "SELECT * FROM best_seller b WHERE b.area_id =:areaId ORDER BY b.quantity ASC Limit 10",nativeQuery = true)
	 List<BestSeller> getTopBestSellerByArea(@Param("areaId") int areaId);
	
}
