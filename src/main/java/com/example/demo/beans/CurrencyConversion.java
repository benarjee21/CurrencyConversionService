package com.example.demo.beans;

import java.math.BigDecimal;

public class CurrencyConversion {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal convertioNMultiple;
	private BigDecimal convertedValue;
	private BigDecimal quantity;
	private int port;
	
	protected CurrencyConversion() {
		
	}
	
	public CurrencyConversion(Long id, String from, String to, BigDecimal convertioNMultiple, BigDecimal convertedValue,
			BigDecimal quantity, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convertioNMultiple = convertioNMultiple;
		this.convertedValue = convertedValue;
		this.quantity = quantity;
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConvertioNMultiple() {
		return convertioNMultiple;
	}

	public void setConvertioNMultiple(BigDecimal convertioNMultiple) {
		this.convertioNMultiple = convertioNMultiple;
	}

	public BigDecimal getConvertedValue() {
		return convertedValue;
	}

	public void setConvertedValue(BigDecimal convertedValue) {
		this.convertedValue = convertedValue;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

}
