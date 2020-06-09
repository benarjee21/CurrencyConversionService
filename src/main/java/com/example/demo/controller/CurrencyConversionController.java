package com.example.demo.controller;

import java.math.BigDecimal;
//import java.util.HashMap;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;

import com.example.demo.beans.CurrencyConversion;
import com.example.demo.services.CurrencyConversionServicePorxyServer;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	CurrencyConversionServicePorxyServer proxyResponce;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion currencyConversionValue(@PathVariable String  from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		
//		Map<String,String> uriVariables = new HashMap<>();
//		
//		ResponseEntity<CurrencyConversion> responceEntity =new RestTemplate().getForEntity("http://localhost:8082/currency-exchange/from/USD/to/IND",CurrencyConversion.class,uriVariables);
//		
//		CurrencyConversion responce = responceEntity.getBody();
		
		CurrencyConversion responce = proxyResponce.retriveExchangeFeign(from, to);
		
		return new CurrencyConversion(responce.getId(),from,to,responce.getConvertioNMultiple(),quantity.multiply(responce.getConvertioNMultiple()),
				quantity,responce.getPort());
	}

}