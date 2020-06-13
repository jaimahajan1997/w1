package com.jai.week10_2.participantservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@RestController
public class ParticipantServiceApplication {
	public ArrayList<bean> participants=new ArrayList<bean>();

	@Autowired
	private proxypart proxy;

	@GetMapping("/participant")
	public bean participant(@PathVariable String participantId,  @PathVariable String topic,@PathVariable String startTime,@PathVariable String endTime) {

		// Feign - Problem 1
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("participantId", participantId);

		ResponseEntity<bean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8100/participant", bean.class,
				uriVariables);

		bean response = responseEntity.getBody();

		return new bean(response.getMeetingId(), response.getTopic(),response.getStartTime(), response.getEndTime());
	}

	
	@GetMapping("/participant/id")
	public bean participantid(@PathVariable int participantId,  @PathVariable String topic,@PathVariable String startTime,@PathVariable String endTime) {

		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("participantId", participantId);

		ResponseEntity<bean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8100/participant/id", bean.class,
				uriVariables);

		bean response = responseEntity.getBody();
		if(response.getMeetingId()==participantId) {
		return new bean(response.getMeetingId(), response.getpName(),response.getMeetingId());
		}
		return null;

	}

	
}

