package com.vinu.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConvertorController {

	@Autowired
	private CurrencyExchangeProxy proxy;
	
	@GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quant}")
	public CurrencyController getConversionRate(@PathVariable("from") String from,
			@PathVariable("to") String to,@PathVariable("quant") BigDecimal quant) {
		
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);

			ResponseEntity<CurrencyController> resEntity = new RestTemplate().getForEntity(
					"http://localhost:8000/currency-exchange/from/{from}/to/{to}"
				,CurrencyController.class
				,uriVariables);
			
			System.out.println("Response : "+resEntity + " map : "+uriVariables);
			
			CurrencyController res = resEntity.getBody();
			
			
		return new CurrencyController(res.getId()
				,res.getFrom()
				,res.getTo()
				,res.getconversionMultiple()
				,res.getPort()
				,quant
				,quant.multiply(res.getconversionMultiple())
				);
	}
	
	@GetMapping("currency-converter-feign/from/{from}/to/{to}/quantity/{quant}")
	public CurrencyController getConversionRateFeign(@PathVariable("from") String from,
			@PathVariable("to") String to,@PathVariable("quant") BigDecimal quant) {
		
		CurrencyController res =  proxy.retrieveExchangeValue(from, to);
			
			//CurrencyController res = resEntity.getBody();
			
			
		return new CurrencyController(res.getId()
				,res.getFrom()
				,res.getTo()
				,res.getconversionMultiple()
				,res.getPort()
				,quant
				,quant.multiply(res.getconversionMultiple())
				);
	}
}
