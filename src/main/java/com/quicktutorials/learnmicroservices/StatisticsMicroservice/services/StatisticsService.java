package com.quicktutorials.learnmicroservices.StatisticsMicroservice.services;

import java.util.List;

import com.quicktutorials.learnmicroservices.StatisticsMicroservice.entities.Statistics;

public interface StatisticsService {

	
	List<Statistics> getStatistics(String jwt, String email);
}
