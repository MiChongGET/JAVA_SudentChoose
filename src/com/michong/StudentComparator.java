package com.michong;

import java.util.Comparator;

//定义临时的接口
public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.id.compareTo(arg1.name);
	}

}
