package com.individual.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.individual.Entity.DayOff;

@Repository
public interface DayOffRepository extends JpaRepository<DayOff, Integer> {


	@Query(value = "select d from DayOff d group by d.staff.id")
	Page<DayOff> getDayOff(Pageable pageRequest);
}
