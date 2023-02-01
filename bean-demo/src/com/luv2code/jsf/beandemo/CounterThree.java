package com.luv2code.jsf.beandemo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CounterThree {

	private int value = 0;

	public String increment() {
		value++;
		
		return "counter_three";
	}
	
	public CounterThree() {
		
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

		
}
