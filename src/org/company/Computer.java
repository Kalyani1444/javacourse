package org.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Computer {

	final void main(String[] args) {

		List<Integer> li = new ArrayList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);

		li.addAll(li);
		
		System.out.println(li);
			
		for (int i = 0; i < li.size(); i++) {
			
		}

for (Integer x : li) {
	System.out.println(x);
	
	}
	}}
	
	
