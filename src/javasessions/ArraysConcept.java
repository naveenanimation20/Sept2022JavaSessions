package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {

		//array: can hold only similar type of data
		
		//two major limitations:
		//1. size is fixed: static array: to overcome this issue, we have to use dynamic array: ArrayList
		//2. it only stores similar types of data: to overcome this issue, we can use static object array.
		
		
		
		
		//int array:
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		System.out.println(i[1] + i[2]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		//System.out.println(i);//I@23232
		System.out.println(Arrays.toString(i));//without loop
		
		//length of array:
		System.out.println(i.length);//4
		
		int len = i.length;//4
		
		//to print all the values from array: for loop:
		//traverse the array
		//iterate the array
		for(int k=0; k<=len-1; k++) {
			System.out.println(k + ":" + i[k]);//10 20 30 40 
		}
		
		//
		System.out.println("------");
		
		int p = 0;
		while(p<=i.length-1) {
			System.out.println(i[p]);//10 20 30 40
			p++;
		}
		
		//
		System.out.println("------");

		for(int k=0; k<=len-1; k++) {
			System.out.println(i[k]);//10 20
			if(i[k] == 20) {
				System.out.println("bye");
				break;
			}
		}
		
		//byte, short, int, long
		//double array:
		double d[] = new double[3];//3
		d[0] = 12.33;
		d[1] = 23.44;
		d[2] = 34.55;
		for(int row=0; row<=d.length-1; row++) {
			System.out.println(d[row]);
		}
		
		//char array:
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '1';
		c[2] = '$';
		
		//String array:
		String emp[] = new String[4];
		emp[0] = "Tom";
		emp[1] = "Ravi";
		emp[2] = "Lisa";
		emp[3] = "Peter";
		
		System.out.println("total emps: " + emp.length);
		
		System.out.println(Arrays.toString(emp));
		
		for(int s=0; s<=emp.length-1; s++) {
			System.out.println(emp[s]);
				if(emp[s].equals("Lisa")) {
					System.out.println("she is a manager");
				}
		}
		
		System.out.println("--------");
		//for each loop:
		int num[] = new int[4];
		num[0] = 100;
		num[1] = 200;
		num[2] = 300;
		num[3] = 400;
		
		for(int e : num) {
			System.out.println(e);
		}

		System.out.println("-----");
		
		String employee[] = new String[5];
		employee[0] = "Tom";
		employee[1] = "Ravi";
		employee[2] = "Lisa";
		employee[3] = "Peter";
		employee[4] = "Sunita";
		
		for(String e : employee) {
			System.out.println(e);
		}

		
		//Array literals:
		int pop[] = {1,2,3,4,11,10,90,-89};
		System.out.println(pop.length);
		System.out.println("Li " + 0);
		System.out.println("Hi = " + (pop.length-1));
		
		
		//String literals: static array
		String str[] = {"java", "python", "dot net"};
		String str1[] = {"java", "python", "dot net"};

		//li = 0;
		//length = 3;
		//hi = length - 1;
		//length = hi + 1;
		
		System.out.println(Arrays.toString(str));
		System.out.println(str.length-1);
		System.out.println(1+":"+str[1]);
		
		
		System.out.println("-------------");
		//emp data: String, int, double, char, boolean
		
		//Object Array: static array:
		
		Object empData[] = new Object[5];
		
		empData[0] = "Vani";
		empData[1] = 25;
		empData[2] = 25.66;
		empData[3] = 'f';
		empData[4] = true;

		System.out.println(empData.length);//5
		
		System.out.println(Arrays.toString(empData));

		//for loop:
		for(int k=0; k<=empData.length-1; k++) {
			System.out.println(empData[k]);
		}
		
		//for each loop:
		for(Object naveen : empData) {
			System.out.println(naveen);
		}
		
		//Object literals:
		Object userInfo[] = {"Punith", 26, 34.55, 'm', false};
		System.out.println(userInfo.length);
		
		
		
		
		
		
	}

}
