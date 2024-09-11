package com.hex.spring.annotation.com.hex.spring.annotation1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 

{

    public static void main( String[] args )

    {

    	AnnotationConfigApplicationContext anno=new AnnotationConfigApplicationContext(studentConfig.class);

    	student s=(student)anno.getBean("stud1");
    	result r1 = (result)anno.getBean("res");
    	result r2 = (result)anno.getBean("res1");

        System.out.println(s.toString());
        System.out.println(r1.toString());
        System.out.println(r2.toString());

    }

}

 