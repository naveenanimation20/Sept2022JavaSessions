package DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> marksList = new ArrayList<Integer>();
		System.out.println(marksList.size());//pc = 0 --> size();
		
		
		marksList.add(100);//0
		marksList.add(300);//1
		marksList.add(450);//2
		marksList.add(10);//3
		marksList.add(600);//4
		marksList.add(98);//5
		
		System.out.println(marksList.get(5));

		marksList.add(101);//6
		//marksList.add(null);//7

		System.out.println(marksList.get(6));
		
		System.out.println(marksList);
		
		System.out.println(marksList.size());
		marksList.remove(3);
		System.out.println(marksList.size());
		System.out.println(marksList.get(3));
		
		marksList.add(3, 1100);
		System.out.println(marksList.get(3));
		System.out.println(marksList);
		
		marksList.add(0, 1500);
		System.out.println(marksList);
		System.out.println(marksList.get(0));

		System.out.println("------");
		System.out.println(marksList);
		Collections.sort(marksList);
		System.out.println(marksList);

		Collections.swap(marksList, 3, 5);
		System.out.println(marksList);

		//
		ArrayList<String> stNames = new ArrayList<String>();
		stNames.add("Tom");
		stNames.add("Peter");
		stNames.add("Ravi");
		stNames.add("Naveen");
		stNames.add("Mukta");
		
		Collections.sort(stNames);
		System.out.println(stNames);
		
		ArrayList<String> subjectNames = new ArrayList<String>();
		subjectNames.add("Java");
		subjectNames.add("Py");
		subjectNames.add("Ruby");
		subjectNames.add("C#");
		subjectNames.add("GO");
		
		stNames.addAll(subjectNames);

		System.out.println(stNames);
		
		//top casting:
		List<String> ar = new ArrayList<String>();
		
		List<String> currList =  Arrays.asList("USD", "INR", "JPY", "EUR");
		System.out.println(currList.size());
		System.out.println(currList);
		
		String lang[] = {"Java", "Python", "GO", "Ruby"};
		//static array to dynamic array:
		//array to arraylist:
		List<String> langList = Arrays.asList(lang);
		System.out.println(langList.size());
		System.out.println(langList);
		
		
		ArrayList<Integer> marksList1 = new ArrayList<Integer>();//vc = 10
		ArrayList<Integer> marksList2 = new ArrayList<Integer>(5);//vc = 5...5/2 = 2


		
	}

}
