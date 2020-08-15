package com.springcore.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class car implements Vehicle
{
	@Autowired
	private tyre ty;
	
	public tyre getTy() {
		return ty;
	}

	public void setTy(tyre ty) {
		this.ty = ty;
	}

	public void drive()
	{
		System.out.println("car driving"+ ty);
	}
}
