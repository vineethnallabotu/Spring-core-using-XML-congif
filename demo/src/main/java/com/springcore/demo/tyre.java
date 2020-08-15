package com.springcore.demo;

import org.springframework.stereotype.Component;

@Component
public class tyre
{
	private String band;

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	@Override
	public String toString() {
		return " tyre working";
	}
	

}
