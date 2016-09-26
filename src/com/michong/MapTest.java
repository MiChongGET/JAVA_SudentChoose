package com.michong;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	/*
	 * 用来装学生类的对象
	 * */
	public Map<String,Student>students;
	
	//构造器中初始化student属性
	public MapTest(){
		this.students = new HashMap<String,Student>();
	}
	
	/*测试添加输入学生ID，判断是否被占用
	*若未被占用。则输入姓名，创建学生对象，
	*并且添加到student中
	*/
	
	public void testPut(){
		//输入学生的ID和姓名
		Scanner console = new Scanner(System.in);
		int i =0;
		//设定可以输入三个学生
		while(i<3){
			System.out.println("请输入学生的ID:");
			String ID = console.next();
			//判断ID是否被占用
			Student st = students.get(ID);
			if(st ==null){
			//提示输入学生的姓名
			System.out.println("请输入学生姓名：");
			String name = console.next();
			//创建学生对象
			Student newStudent = new Student(ID, name);
			//通过调用student的put方法，添加ID-学生映射
			students.put(ID, newStudent);
			System.out.println("成功添加学生："+students.get(ID).name);
			i++;
			}else{
				System.out.println("ID已经被占用");
				continue;//设置继续执行循环
			}
			
		}
	}
	
		/*
		 * 测试Map的keySet方法
		 * */
	public void testKeySet(){
		//通过keySet方法，返回Map中的所有“键”的Set集合
		Set<String> keySet = students.keySet();
		
		//取得students的容量
		System.out.println("总共有："+students.size()+"个学生！");
		//遍历keySet，取得每一个键，再调用get方法取得每一个键对应的value
		for(String stuId:keySet){
			Student st = students.get(stuId);
			if(st!=null){
				System.out.println("学生："+st.name);
			}
			
		}
	}
	public static void main(String[] args) {
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
		
		
	}

}
