package com.hex.spring.annotation.com.hex.spring.annotation1;

public class result {
	int marks;
	String remarks;
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String name) {
		this.remarks = name;
	}
	public result()
	{
		
	}
	public result(int marks, String name) {
		super();
		this.marks = marks;
		this.remarks = name;
	}
	@Override
	public String toString() {
		return "result [marks=" + marks + ", name=" + remarks + "]";
	}
	

}
