package com.quicktutorials.learnmicroservices.StatisticsMicroservice.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quicktutorials.learnmicroservices.StatisticsMicroservice.entities.Statistics;

public interface StatisticsDao extends JpaRepository<Statistics, Integer>{

	
	
}
