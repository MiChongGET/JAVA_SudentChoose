package com.michong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGeneric {
	/*
	 * 带有泛型--Course的List类型属性
	 * */
	public List<Course>course;
	
	//重写TestGeneric类
	public TestGeneric(){
		 this.course = new ArrayList<Course>();
	}
	/*
	 * 测试添加
	 * */
	public void testAdd(){
		Course cr1 = new Course("1", "大学语文");
		course.add(cr1);
		//泛型集合中，不能添加泛型规定以外的对象，否则会报错
		Course[] crs = {new Course("2","高等数学"),new Course("3", "大学英语")};
		course.addAll(Arrays.asList(crs));
		
	};
	
	/*
	 *测试循环遍历 
	 **/
	public void testForEach(){
		for(Course cr:course){
			System.out.println(cr.id+":"+cr.name);
			
		}
	}
	
	//泛型结合可以添加泛型的子类型的对象实例
	public void testChild(){
		ChildCourse ccr = new ChildCourse();
		ccr.id="4";
		ccr.name="数据结构";
		course.add(ccr);
		
	}
	
	//泛型不能使用基本类型
	public void testBasicType(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println(list.get(0));
	}
	
 public static void main(String[] args) {
	 TestGeneric tg = new TestGeneric();
	 tg.testAdd();
	 tg.testChild();
	 tg.testBasicType();
	 tg.testForEach();
	 
	
   }
}
