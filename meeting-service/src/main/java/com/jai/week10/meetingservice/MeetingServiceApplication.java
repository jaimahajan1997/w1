package com.jai.week10.meetingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.math.BigDecimal;
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
public class MeetingServiceApplication {
	
	@Autowired
	private meetingserviceproxy proxy;
	@Autowired
	private proxypart proxy2;

	@GetMapping("/meeting")
	public meetingservicebean meeting(@PathVariable String meetingId,  @PathVariable String topic,@PathVariable String startTime,@PathVariable String endTime) {

		// Feign - Problem 1
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("meetingId", meetingId);

		ResponseEntity<meetingservicebean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8100/meeting", meetingservicebean.class,
				uriVariables);

		meetingservicebean response = responseEntity.getBody();

		return new meetingservicebean(response.getMeetingId(), response.getTopic(),response.getStartTime(), response.getEndTime());
	}

	
	@GetMapping("/meeting/id")
	public meetingservicebean meetingid(@PathVariable String meetingId,  @PathVariable String topic,@PathVariable String startTime,@PathVariable String endTime) {

		// Feign - Problem 1
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("meetingId", meetingId);

		ResponseEntity<meetingservicebean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8100/meeting/id", meetingservicebean.class,
				uriVariables);

		meetingservicebean response = responseEntity.getBody();
		if(response.getMeetingId()==meetingId) {
		return new meetingservicebean(response.getMeetingId(), response.getTopic(),response.getStartTime(), response.getEndTime());
		}
		return null;

	}

	@GetMapping("/meeting/id/participants")
	public meetingservicebean meetingidfeign(@PathVariable String meetingId,  @PathVariable String topic,@PathVariable String startTime,@PathVariable String endTime) {

		meetingservicebean response = proxy.retrieve(meetingId);

		if(response.getMeetingId()==meetingId) {
			return new meetingservicebean(response.getMeetingId(),response.getTopic(),response.getStartTime(), response.getEndTime());

		}
		return null;
	}
	
}

