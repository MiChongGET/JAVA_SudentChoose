package com.michong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	
	public List<Course>coursesToSelect;
	private Scanner console;
	public Student student;
	
	public SetTest(){
		coursesToSelect = new ArrayList<Course>();
		console = new Scanner(System.in);
	}
	/*
	 * ������courseToSelect����ӱ�ѡ�γ�
	 * */
	public void testAdd(){
		//����һ���γ̶��󣬲�ͨ������add��������ӵ���ѡ�γ�
		Course cr1 =new Course("1", "���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp=(Course) coursesToSelect.get(0);
		System.out.println("����˿γ�"+temp.id+":"+temp.name);
		
		Course cr2 = new Course("2", "C����");
		coursesToSelect.add(cr2);
		Course temp2 = (Course) coursesToSelect.get(1);
		System.out.println("����˿γ�"+temp2.id+":"+temp2.name);
		
		
 
		/*
		 * ���·������׳������±�Խ���쳣*/
//		Course cr3 = new Course("3", "test");
//		coursesToSelect.add(4,cr3);
		
		Course[] course = {new Course("3","��ɢ��ѧ"),new Course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		System.out.println("��������ſγ̣�"+temp3.id+":"+temp3.name+"  "+temp4.id+":"+temp4.name);
		
		Course[] course2 = {new Course("5","�ߵ���ѧ"),new Course("6","java���")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		System.out.println("��������ſγ̣�"+temp5.id+":"+temp5.name+"  "+temp6.id+":"+temp6.name);
	}
	
	/*
	 * ȡ��List�е�Ԫ�صķ���
	 * */

	public void testGet(){
		int size = coursesToSelect.size();
		for(int i=0;i<size;i++){
		Course cr = (Course)coursesToSelect.get(i);
		System.out.println("�γ̣�"+cr.id+":"+cr.name);
		}
	}
	
	
	/*
	 * ͨ��������������List
	 * ���ܶ������ڣ����洢����*/
	public void testIterator(){
		Iterator it = coursesToSelect.iterator();
		System.out.println("�����¿γ̴�ѡ��ͨ�����������ʣ�:");
		while(it.hasNext()){
			Course cr = (Course) it.next();
			System.out.println("�γ̣�"+cr.id+":"+cr.name);
		}
	}
	
	
	/*
	 * ͨ��foreach�������ʼ���Ԫ��
	 * */
	public void testForEach(){
		System.out.println("ͨ��foreach�������ʼ���Ԫ��:");
		for(Object obj:coursesToSelect){
			Course cr =(Course)obj;
			System.out.println("�γ�"+cr.id+":"+cr.name);
		}
	}
	
	/*
	 * ����List��contains����
	 * */
	public void testListContains(){
		//ȡ�ñ�ѡ�γ����еĵ�0��Ԫ��
		Course course = coursesToSelect.get(0);
		//��ӡ���coursesToSelected�Ƿ����course����
		System.out.println("ȡ�ÿγ̣�"+course.name);
		System.out.println("��ѡ�γ����Ƿ�����γ̣�"+course.name+","+coursesToSelect.contains(course));
		
		//��ʾ����γ�����
		System.out.println("������γ�����:");
		String name = console.next();
		
		//����һ���µĿγ̶���ID�����ƣ���course������ȫһ��
		Course course2 = new Course();
		course2.name = name;
		System.out.println("�´����γ̣�"+course2.name);
		System.out.println("��ѡ�γ����Ƿ�����γ̣�"+course2.name+","+coursesToSelect.contains(course2));
		
		//ͨ��indexOf����ȡ��ĳԪ�ص�����λ��
		if(coursesToSelect.contains(course2)){
			System.out.println("�γ�:"+course2.name+"������λ��Ϊ��"+coursesToSelect.indexOf(course2));
			
		}
	}
	
	
	/*
	 * ����ѧ������ѡ��
	 * */
	public void creatStudentAndSelectCours(){
		Student student = new Student("1", "С��");
		System.out.println("��ӭѧ��"+student.name);
		//����һ��Scanner�����������մӼ��������ID
		Scanner console = new Scanner(System.in);
		
		for(int i =0;i<3;i++){
			System.out.println("������γ�ID");
			String courseId =console.next();
			for(Course cr:coursesToSelect){
				if(cr.id.equals(courseId)){
					student.course.add(cr);
				}
			}
		}
		testForEachSet(student);	
	}

	/*
	 * ����Set��contains����
	 * */
	public void testSetContains(){
		//��ʾ����γ�����
		System.out.println("������ѧ����ѡ�γ̵����ƣ�");
		String name = console.next();
		Course course2= new Course();
		course2.name = name;
		System.out.println("�´����γ̣�"+course2.name);
		System.out.println("��ѡ�γ����Ƿ�����γ̣�"+course2.name+","+student.courses.contains(course2));
		
		
	}
	
	public static void main(String[] args) {
		SetTest st = new SetTest();
		st.testAdd();
		st.testListContains();
		st.testForEach();
//		st.creatStudentAndSelectCours();
//		st.testSetContains();
//	    st.testListContains();
//		//����һ��ѧ������
//		Student student = new Student("1", "С��");
//		System.out.println("��ӭѧ��"+student.name);
//		//����һ��Scanner�����������մӼ��������ID
//		Scanner console = new Scanner(System.in);
//		
//		for(int i =0;i<3;i++){
//			System.out.println("������γ�ID");
//			String courseId =console.next();
//			for(Course cr:st.coursesToSelect){
//				if(cr.id.equals(courseId)){
//					student.course.add(cr);
//					
//				}
//			}
//		}
//        st.testForEachSet(student);	
	}
	
	//��ӡ�����ѧ����ѡ�Ŀγ�
	public void testForEachSet(Student student){
		for(Course cr:student.courses){
		System.out.println("ѡ���˿γ̣�"+cr.id+":"+cr.name);
		}
	}
	
			
}

