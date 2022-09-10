package com.Interface;

import java.util.ArrayList;
import java.util.List;
public class Employee {
	public static void main(String[] args) {
		List<Comparable> li=new ArrayList();
		li.add(10);
		li.add("java");
		li.add(true);
		li.add(5678.56789);
		li.add('t');
		li.add(10);
		li.add(10);
		System.out.println(li);
		int size=li.size();
		System.out.println(size);
		
	}

}
