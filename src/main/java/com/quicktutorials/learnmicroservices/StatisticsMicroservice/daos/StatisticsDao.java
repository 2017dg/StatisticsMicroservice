package com.quicktutorials.learnmicroservices.StatisticsMicroservice.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.quicktutorials.learnmicroservices.StatisticsMicroservice.entities.Statistics;

public interface StatisticsDao extends JpaRepository<Statistics, Integer>{

	@Query(value="Select * from latest_statistics where EMAIL=:email ORDER BY DATE DESC LIMIT 10;", nativeQuery = true)
	public List<Statistics> getLastStatistics(@Param("email")String email);
	
}
