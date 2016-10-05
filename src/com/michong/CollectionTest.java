package com.michong;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
   2.对String泛型的list进行排序;
   3.对其他类型泛型的List进行排序，以Student为例 
 */
public class CollectionTest {
	/*
	 * 1.通过Collections.sort()方法。对Integer泛型的List进行排序
	 * 创建一个Integer泛型的List,插入十个100以内的不重复随机整数
	 * 调用Collections.sort()方法对其进行排序
	 * */
	public void testSort1(){
		//不能使用基本类型当做泛型
		List<Integer>integerlist = new  ArrayList<Integer>();
		//插入十个100以内的不重复随机整数
		Random random = new Random();
		Integer k;
		for(int i = 0;i<10;i++){
			do{
			k = random.nextInt(100);
			}while(integerlist.contains(k));//确保k不会重复
			integerlist.add(k);
			System.out.println("成功添加整数："+k);
		}
		System.out.println("---------------排序之前------------");
		for(Integer integer : integerlist){
			System.out.println("元素："+integer);
		}
		Collections.sort(integerlist);
		System.out.println("----------------排序之后----------------");
		for(Integer integer : integerlist){
			System.out.println("元素："+integer);
		}
	}

	/*
	 *  2.对String泛型的list进行排序;
	 *  创建String泛型的List，添加乱序的String元素
	 *  调用sort方法，再次输出排序后的顺序
	 *  <------匹配首字母，若第一个相同，比较第二个------>
	 *  */
	public void testSort2(){
		List<String>stringlist = new ArrayList<String>();
		stringlist.add("microsoft");
		stringlist.add("baidu");
		stringlist.add("google");
		System.out.println("------------排序前-----------");
		for(String string:stringlist){
			System.out.println("元素:"+string);
		}

		Collections.sort(stringlist);
		System.out.println("------------排序前-----------");
		for(String string:stringlist){
			System.out.println("元素:"+string);
		}
	}
	
	
	/* * 1.创建完List之后，往其中添加10条随机字符串 *
	 *  2.每条字符串的长度为10以内的随机整数 *
	 *   3。每条字符串的每个字符都为随机生成的字符，字符可以重复 * 
	 *   4.每条随机字符串不可重复
	 *    */
	public void testSort3(){
		List<String>stringlist = new ArrayList<String>();
		String string = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		int length = (int) (Math.random()*10+1);
		Random random = new Random();
		String to ;
		for(int j = 0;j<10;j++){
			
			for(int i =0;i<length;i++){
				do{to = sb.append(string.charAt(random.nextInt(string.length()))).toString();
				}while(stringlist.contains(to));
				stringlist.add(to);
				System.out.println("要添加的字符串："+to);
			}
		}
		System.out.println("------------排序前-----------");
		for(String string2:stringlist){
			System.out.println("元素:"+string2);
		}

		Collections.sort(stringlist);
		System.out.println("------------排序前-----------");
		for(String string2:stringlist){
			System.out.println("元素:"+string2);
		}
		}
		

	//3.对其他类型泛型的List进行排序，以Student为例 
	//使用comparable接口
	public void testSort4(){
		List<Student> studentList = new ArrayList<Student>();
		Random random = new Random();
//		
//		String to = null;
//		for(int i = 0;i<3;i++){
//			do{
//				to = random.nextInt(1000)+"";
//			}
//			while(studentList.contains(to));
//			System.out.println(to);
//		}
		
		studentList.add(new Student(random.nextInt(1000)+"","Mike"));
		studentList.add(new Student(random.nextInt(1000)+"","Jan"));
		studentList.add(new Student(random.nextInt(1000)+"","LUlu"));
		System.out.println("-----------排序前---------");
		for(Student student :studentList){
			System.out.println("学生"+student.id+":"+student.name);
		}
		Collections.sort(studentList);
		System.out.println("-----------排序后--------------");
		for(Student student :studentList){
			System.out.println("学生"+student.id+":"+student.name);
		}
		Collections.sort(studentList,new StudentComparator());
		System.out.println("-----------按照学生姓名排序-------------------");
		for(Student student :studentList){
			System.out.println("学生"+student.id+":"+student.name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionTest ct = new CollectionTest();
		//ct.testSort1();
		//ct.testSort2();
		//ct.testSort3();
		ct.testSort4();
	}

}
