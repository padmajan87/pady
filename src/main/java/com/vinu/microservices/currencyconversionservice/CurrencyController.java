/**
 * 
 */
package com.vinu.microservices.currencyconversionservice;

import java.math.BigDecimal;

/**
 * @author Vinu
 *
 */
public class CurrencyController {

	private long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private int port;
	private BigDecimal quantity;
	private BigDecimal totalAmt;
	
	public CurrencyController() {}
	
	/**
	 * @param id
	 * @param from
	 * @param to
	 * @param conversionMultiple
	 * @param port
	 * @param quantity
	 * @param totalAmt
	 */
	public CurrencyController(long id, String from, String to, BigDecimal conversionMultiple, int port, BigDecimal quantity,
			BigDecimal totalAmt) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.port = port;
		this.quantity = quantity;
		this.totalAmt = totalAmt;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * @return the conversionMultiple
	 */
	public BigDecimal getconversionMultiple() {
		return conversionMultiple;
	}
	/**
	 * @param conversionMultiple the conversionMultiple to set
	 */
	public void setconversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}
	/**
	 * @return the quantity
	 */
	public BigDecimal getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the totalAmt
	 */
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}
	/**
	 * @param totalAmt the totalAmt to set
	 */
	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CurrencyController [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple=" + conversionMultiple
				+ ", port=" + port + ", quantity=" + quantity + ", totalAmt=" + totalAmt + "]";
	}

	
}
