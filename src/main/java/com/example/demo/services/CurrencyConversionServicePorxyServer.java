package com.example.demo.services;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.beans.CurrencyConversion;

@Component
//@FeignClient(name="currency-exchange-service",url="localhost:8082")
//@FeignClient(name="currency-exchange-service")
@FeignClient(name="netflix-zuul-api-gateway-sever")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyConversionServicePorxyServer {
	
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retriveExchangeFeign(@PathVariable String from,@PathVariable String to);

}
