package com.supergose.poc.spring.simplecalculator;

public class Rating {

	private String name;
	private Integer value;

	public Rating() {
		super();
	}

	public Rating(String name, Integer value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
