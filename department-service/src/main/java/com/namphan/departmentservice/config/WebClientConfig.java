package com.namphan.departmentservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import com.namphan.departmentservice.client.EmployeeClient;

@Configuration
public class WebClientConfig {
	
	@Autowired
	private LoadBalancedExchangeFilterFunction filterFuntion;

	@Bean
	WebClient employeeWebClient() {
		return WebClient.builder()
				.baseUrl("http://employee-service")
				.filter(filterFuntion)
				.build();
	}
	
	@Bean
	EmployeeClient employeeClient() {
		HttpServiceProxyFactory httpServiceProxyFactory = 
				HttpServiceProxyFactory.builder(WebClientAdapter.create(employeeWebClient()))
				.build();
		return httpServiceProxyFactory.createClient(EmployeeClient.class);
	}
	
}
