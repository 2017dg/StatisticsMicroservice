package com.quicktutorials.learnmicroservices.StatisticsMicroservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quicktutorials.learnmicroservices.StatisticsMicroservice.services.StatisticsService;
import com.quicktutorials.learnmicroservices.StatisticsMicroservice.utilities.JsonResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
    StatisticsService statisticsService;

    @CrossOrigin
    @RequestMapping("/getStatistics")
    public ResponseEntity<JsonResponseBody> getStatistics(@RequestParam(value="jwt") String jwt, @RequestParam(value="email") String email){
        return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(), statisticsService.getStatistics(jwt, email)));
    }

    @RequestMapping("/test")
    public String test(){
        return "StatisticsMicroservice works correctly!";
    }
}
