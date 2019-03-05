/**
 * 
 */
package com.vinu.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Vinu
 *
 */
@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {
	ExchangeValue findByFromAndTo(String from,String to);
}
