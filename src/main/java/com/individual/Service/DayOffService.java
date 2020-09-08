package com.individual.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.individual.Entity.DayOff;


public interface DayOffService {

	Page<DayOff> getDayOff(Pageable pageRequest);
}
