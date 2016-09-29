package com.michong;

import java.util.ArrayList;

public class ArrayListDemo {
	public static ArrayList list;
	public static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 list= new ArrayList();
		for(int i=0;i<10;i++){
		list.add(i);
		
		}
		
		sout();
		list.remove(5);
		sout();
	}
	public static void sout(){
		Object a[]=list.toArray();
		for(int j=0;j<a.length;j++){
			 sum =sum+((Integer)a[j]).intValue();
			
		}
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("×ÜºÍÊÇ£º"+sum);
	}

}
