package com.jai.week10.meetingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface meetingserviceproxy {
	@GetMapping("/participants")
	public meetingservicebean retrieve{
		(@PathVariable("id") String id);
		}
}
