package com.michong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGeneric {
	/*
	 * ���з���--Course��List��������
	 * */
	public List<Course>course;
	
	//��дTestGeneric��
	public TestGeneric(){
		 this.course = new ArrayList<Course>();
	}
	/*
	 * �������
	 * */
	public void testAdd(){
		Course cr1 = new Course("1", "��ѧ����");
		course.add(cr1);
		//���ͼ����У�������ӷ��͹涨����Ķ��󣬷���ᱨ��
		Course[] crs = {new Course("2","�ߵ���ѧ"),new Course("3", "��ѧӢ��")};
		course.addAll(Arrays.asList(crs));
		
	};
	
	/*
	 *����ѭ������ 
	 **/
	public void testForEach(){
		for(Course cr:course){
			System.out.println(cr.id+":"+cr.name);
			
		}
	}
	
	//���ͽ�Ͽ�����ӷ��͵������͵Ķ���ʵ��
	public void testChild(){
		ChildCourse ccr = new ChildCourse();
		ccr.id="4";
		ccr.name="���ݽṹ";
		course.add(ccr);
		
	}
	
	//���Ͳ���ʹ�û�������
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
