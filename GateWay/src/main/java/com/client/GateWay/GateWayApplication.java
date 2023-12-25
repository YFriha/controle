package com.client.GateWay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateWayApplication.class, args);
	}
	@Bean
	public DiscoveryClientRouteDefinitionLocator routesDynamic(
	        ReactiveDiscoveryClient reactiveDiscoveryClient,
	        DiscoveryLocatorProperties discoveryLocatorProperties) {
	    return new DiscoveryClientRouteDefinitionLocator(reactiveDiscoveryClient, discoveryLocatorProperties);
	}
	 @Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
	 

}
