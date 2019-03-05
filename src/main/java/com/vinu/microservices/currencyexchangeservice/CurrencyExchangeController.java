/**
 * 
 */
package com.vinu.microservices.currencyexchangeservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vinu
 *
 */
@RestController
public class CurrencyExchangeController {
	
	@Autowired
	Environment env;
	
	@Autowired
	ExchangeValueRepository erepo;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable("from") String from
			,@PathVariable("to") String to) {
		
		//ExchangeValue exchangeValue =  new ExchangeValue(1000L,from,to,BigDecimal.valueOf(65));
		ExchangeValue exchangeValue =  erepo.findByFromAndTo(from,to);
		exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));

		return exchangeValue;
	}
}
