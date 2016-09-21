package com.michong;

import java.util.HashSet;
import java.util.Set;
/*
 * Ñ§ÉúÀà*/

public class Student {
	public String id;
	public String name;
	public Set course;
	public Student(String id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.course=new HashSet();
	}

}
