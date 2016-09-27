package com.michong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	
	public List<Course>coursesToSelect;
	
	public SetTest(){
		coursesToSelect = new ArrayList<Course>();
	}
	/*
	 * 用于往courseToSelect中添加备选课程
	 * */
	public void testAdd(){
		//创建一个课程对象，并通过调用add方法，添加到备选课程
		Course cr1 =new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		Course temp=(Course) coursesToSelect.get(0);
		System.out.println("添加了课程"+temp.id+":"+temp.name);
		
		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(cr2);
		Course temp2 = (Course) coursesToSelect.get(1);
		System.out.println("添加了课程"+temp2.id+":"+temp2.name);
		
		
 
		/*
		 * 以下方法会抛出数组下标越界异常*/
//		Course cr3 = new Course("3", "test");
//		coursesToSelect.add(4,cr3);
		
		Course[] course = {new Course("3","离散数学"),new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		System.out.println("添加了两门课程："+temp3.id+":"+temp3.name+"  "+temp4.id+":"+temp4.name);
		
		Course[] course2 = {new Course("5","高等数学"),new Course("6","java编程")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		System.out.println("添加了两门课程："+temp5.id+":"+temp5.name+"  "+temp6.id+":"+temp6.name);
	}
	
	/*
	 * 取得List中的元素的方法
	 * */

	public void testGet(){
		int size = coursesToSelect.size();
		for(int i=0;i<size;i++){
		Course cr = (Course)coursesToSelect.get(i);
		System.out.println("课程："+cr.id+":"+cr.name);
		}
	}
	
	
	/*
	 * 通过迭代器来遍历List
	 * 不能独立存在，不存储数据*/
	public void testIterator(){
		Iterator it = coursesToSelect.iterator();
		System.out.println("有如下课程待选（通过迭代器访问）:");
		while(it.hasNext()){
			Course cr = (Course) it.next();
			System.out.println("课程："+cr.id+":"+cr.name);
		}
	}
	
	
	/*
	 * 通过foreach方法访问集合元素*/
	public void testForEach(){
		System.out.println("通过foreach方法访问集合元素:");
		for(Object obj:coursesToSelect){
			Course cr =(Course)obj;
			System.out.println("课程"+cr.id+":"+cr.name);
		}
	}
	
	/*
	 * 测试List的contains方法
	 * */
	public void testListContains(){
		//取得备选课程序列的第0个元素
		Course course = coursesToSelect.get(0);
		//打印输出coursesToSelected是否包含course对象
		System.out.println("取得课程："+course.name);
		System.out.println("备选课程中是否包含课程："+course.name+","+coursesToSelect.contains(course));
	}

	public static void main(String[] args) {
		SetTest st = new SetTest();
		st.testAdd();
		st.testForEach();
		//创建一个学生对象
		Student student = new Student("1", "小明");
		System.out.println("欢迎学生"+student.name);
		//创建一个Scanner对象，用来接收从键盘输入的ID
		Scanner console = new Scanner(System.in);
		
		for(int i =0;i<3;i++){
			System.out.println("请输入课程ID");
			String courseId =console.next();
			for(Course cr:st.coursesToSelect){
				if(cr.id.equals(courseId)){
					student.course.add(cr);
					
				}
			}
		}
		st.testForEachSet(student);	
	}
	
	//打印输出，学生所选的课程
	public void testForEachSet(Student student){
		
		for(Course cr:student.courses){
		System.out.println("选择了课程："+cr.id+":"+cr.name);
		}
	}
	
			
}

