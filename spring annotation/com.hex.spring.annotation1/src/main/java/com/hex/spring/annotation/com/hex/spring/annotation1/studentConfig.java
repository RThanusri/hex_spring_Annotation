package com.hex.spring.annotation.com.hex.spring.annotation1;

import org.springframework.context.annotation.Bean;

public class studentConfig {
	
	
		
			@Bean(name= "stud1")
			
			public student getStudent()
			{
				student s1=new student();
				s1.setRoll(101);
				s1.setName("Ajay");
				s1.setFee(200000);
				return s1;
			}
			
			@Bean(name="stud2")
			public student getStudent1()
			{
				student s2=new student();
				s2.setRoll(102);
				s2.setName("Ajaykrishna");
				s2.setFee(300000);
				return s2;
			}
			@Bean(name="res")
			public result getResult()
			{
				result r =new result();
				r.setMarks(99);
				r.setRemarks("pass");
				return r;
				
			}
			@Bean(name="res1")
			public result getResult1()
			{
				result r =new result();
				r.setMarks(89);
				r.setRemarks("pass");
				return r;
				
			}
			

		


	}



