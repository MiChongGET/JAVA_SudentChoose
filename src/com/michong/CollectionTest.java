package com.michong;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
   2.��String���͵�list��������;
   3.���������ͷ��͵�List����������StudentΪ�� 
 */
public class CollectionTest {
	/*
	 * 1.ͨ��Collections.sort()��������Integer���͵�List��������
	 * ����һ��Integer���͵�List,����ʮ��100���ڵĲ��ظ��������
	 * ����Collections.sort()���������������
	 * */
	public void testSort1(){
		//����ʹ�û������͵�������
		List<Integer>integerlist = new  ArrayList<Integer>();
		//����ʮ��100���ڵĲ��ظ��������
		Random random = new Random();
		Integer k;
		for(int i = 0;i<10;i++){
			do{
			k = random.nextInt(100);
			}while(integerlist.contains(k));//ȷ��k�����ظ�
			integerlist.add(k);
			System.out.println("�ɹ����������"+k);
		}
		System.out.println("---------------����֮ǰ------------");
		for(Integer integer : integerlist){
			System.out.println("Ԫ�أ�"+integer);
		}
		Collections.sort(integerlist);
		System.out.println("----------------����֮��----------------");
		for(Integer integer : integerlist){
			System.out.println("Ԫ�أ�"+integer);
		}
	}

	/*
	 *  2.��String���͵�list��������;
	 *  ����String���͵�List����������StringԪ��
	 *  ����sort�������ٴ����������˳��
	 *  <------ƥ������ĸ������һ����ͬ���Ƚϵڶ���------>
	 *  */
	public void testSort2(){
		List<String>stringlist = new ArrayList<String>();
		stringlist.add("microsoft");
		stringlist.add("baidu");
		stringlist.add("google");
		System.out.println("------------����ǰ-----------");
		for(String string:stringlist){
			System.out.println("Ԫ��:"+string);
		}

		Collections.sort(stringlist);
		System.out.println("------------����ǰ-----------");
		for(String string:stringlist){
			System.out.println("Ԫ��:"+string);
		}
	}
	
	
	/* * 1.������List֮�����������10������ַ��� *
	 *  2.ÿ���ַ����ĳ���Ϊ10���ڵ�������� *
	 *   3��ÿ���ַ�����ÿ���ַ���Ϊ������ɵ��ַ����ַ������ظ� * 
	 *   4.ÿ������ַ��������ظ�
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
				System.out.println("Ҫ��ӵ��ַ�����"+to);
			}
		}
		System.out.println("------------����ǰ-----------");
		for(String string2:stringlist){
			System.out.println("Ԫ��:"+string2);
		}

		Collections.sort(stringlist);
		System.out.println("------------����ǰ-----------");
		for(String string2:stringlist){
			System.out.println("Ԫ��:"+string2);
		}
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionTest ct = new CollectionTest();
		//ct.testSort1();
		//ct.testSort2();
		ct.testSort3();
	}

}
