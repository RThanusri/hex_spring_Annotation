package com.hex.spring.annotation.com.hex.spring.annotation1;

import org.springframework.beans.factory.annotation.Autowired;

public class student {
	int roll;
	String name;
	int fee;
	@Autowired
	result res;
	public result getRes() {
		return res;
	}
	public void setRes(result res) {
		this.res = res;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "student [roll=" + roll + ", name=" + name + ", fee=" + fee + "]";
	}
	student()
	{
		
	}
	public student(int roll, String name, int fee) {
		super();
		this.roll = roll;
		this.name = name;
		this.fee = fee;
	}
	

}
