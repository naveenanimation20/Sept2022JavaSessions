package DynamicArray;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList (C) ----> implements List
		//default class
		//dynmaic array
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		System.out.println(ar.size());

		ar.add("java");//2
		ar.add(12.33);//3
		ar.add(true);//4
		ar.add('a');//5
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(4));
		//System.out.println(ar.get(6));//IOB
		
		//size:
		System.out.println(ar.size());//6
		System.out.println("-------");

		//to print all the value from arraylist:
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("-------");
		//for each:
		for(Object e : ar) {
			System.out.println(e);
		}
		System.out.println("-------");

		//generics in arraylist:
		//student names :
		ArrayList<String> stNames = new ArrayList<String>();
		stNames.add("Tom");
		stNames.add("Peter");
		stNames.add("Ravi");
		stNames.add("Ravi");
		System.out.println(stNames.size());

		for(String e : stNames) {
			System.out.println(e);
		}
		
		

		
		System.out.println("-------");
		ArrayList<Integer> stMarks = new ArrayList<Integer>();
		stMarks.add(100);
		stMarks.add(300);
		System.out.println("-------");

		//emp info: 
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Mukta");//0
		empData.add(25);//1
		empData.add(34.55);//2
		empData.add(true);//3
		empData.add('F');//4
		
		System.out.println(empData.size());
		System.out.println(empData);
		
		//for :
		for(int i=0; i<empData.size(); i++) {
			System.out.println(empData.get(i));
				if(empData.get(i).equals(true)) {
					System.out.println("eligible for hike");
				}
		}
		
		//for each:
		for(Object e : empData) {
			System.out.println(e);
		}
		
		
	}

}
