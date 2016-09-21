package com.michong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/*
 * 用于存放备选课程的list
 * */

public class ListTest {
	public List coursesToSelect;
	public ListTest() {
		// TODO Auto-generated constructor stub
		this.coursesToSelect = new ArrayList();
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
	 * 修改list中的元素
	 * 修改其中一个已经存在的课程
	 * */
	public void testModify(){
		coursesToSelect.set(2, new Course("7", "毛概"));
	}
	
	/*
	 * 删除list中的元素
	 * */
	public void testRemove(){
		//删除位置4的数据 
		Course cr = (Course)coursesToSelect.get(4);
		System.out.println("我是课程："+cr.id+cr.name+"我即将被删除");
		//coursesToSelect.remove(cr);
		System.out.println("我已近被删除");
		/*
		 * 批量删除(此处删除4,5)
		 * */
		Course[] cr2 ={(Course) coursesToSelect.get(4),(Course) coursesToSelect.get(5)};
		coursesToSelect.removeAll(Arrays.asList(cr2));
		testForEach();
		
		
	}
	
	public static void main(String[] args){
		ListTest il = new ListTest();
		il.testAdd();
		il.testGet();
		il.testIterator();
		il.testForEach();
		il.testModify();
		il.testForEach();
		il.testRemove();
	}

}
