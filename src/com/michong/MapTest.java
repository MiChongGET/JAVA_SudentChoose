package com.michong;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	/*
	 * ����װѧ����Ķ���
	 * */
	public Map<String,Student>students;
	
	//�������г�ʼ��student����
	public MapTest(){
		this.students = new HashMap<String,Student>();
	}
	
	/*�����������ѧ��ID���ж��Ƿ�ռ��
	*��δ��ռ�á�����������������ѧ������
	*������ӵ�student��
	*/
	
	public void testPut(){
		//����ѧ����ID������
		Scanner console = new Scanner(System.in);
		int i =0;
		while(i<3){
			System.out.println("������ѧ����ID:");
			String ID = console.next();
			//�ж�ID�Ƿ�ռ��
			Student st = students.get(ID);
			if(st ==null){
			//��ʾ����ѧ��������
			System.out.println("������ѧ��������");
			String name = console.next();
			//����ѧ������
			Student newStudent = new Student(ID, name);
			//ͨ������student��put���������ID-ѧ��ӳ��
			students.put(ID, newStudent);
			System.out.println("�ɹ����ѧ����"+students.get(ID).name);
			i++;
			}else{
				System.out.println("ID�Ѿ���ռ��");
				continue;
			}
			
		}
	}
	
		/*
		 * ����Map��keySet����
		 * */
	public void testKeySet(){
		//ͨ��keySet����������Map�е����С�������Set����
		Set<String> keySet = students.keySet();
		
		//ȡ��students������
		System.out.println("�ܹ��У�"+students.size()+"��ѧ����");
		//����keySet��ȡ��ÿһ�������ٵ���get����ȡ��ÿһ������Ӧ��value
		for(String stuId:keySet){
			Student st = students.get(stuId);
			if(st!=null){
				System.out.println("ѧ����"+st.name);
				
			}
			
		}
	}
	public static void main(String[] args) {
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
		
	}

}
