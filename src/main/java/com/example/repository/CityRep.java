package com.example.repository;

import com.example.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/2/10 0010.
 */
public interface CityRep extends JpaRepository<City,Integer> {
}
