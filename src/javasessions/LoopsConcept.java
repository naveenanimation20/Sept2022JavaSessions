package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {

		
		//1 to 10
		//1. while:
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			//i++;
			//++i;
			i = i+1;
		}
		
		//
		short s = 1;
		while(s<=10) {
			System.out.println(s);
			s++;
		}
		
		//
		double d = 1.1;
		while(d<=10.0) {
			System.out.println(d);//1.1.....9.1
			d++;
		}
		System.out.println(d);//10.1
		
		//
		while(true) {
			System.out.println("Welcome to Taj Hotel");
			break;
		}
		
		//
		int p = 1;
		while(p<=10) {
			System.out.println(p);//1
			p++;
				if(p==5) {
					System.out.println("bye");//bye
					break;
				}
		}
		
		System.out.println("-------");
		//10 to 1: 10 9 8 7 6 5 4 3 2 1
		int k = 10;
		while(k>=1) {
			System.out.println(k);//10 9 8.......1
			k--;
		}
		
		System.out.println("-------");
		
		//use cases for while loop:
		//number of iterations / cycles are not fixed
		//1. total images/links on the page
		//2. linkedin/facebook/swiggy: infinite scrolling
		//3. search for an element is coming after x seconds
		//4. email in inbox 
		//5. page load time out: 
		

		//2. for loop:
		//1 to 10:
		int n=1;
		for(; n<=10; ) {
			System.out.println(n);//12345....10
			n++;
		}
		System.out.println(n);
		
		//
//		for(;;) {
//			System.out.println("bye");
//		}
		
		//for loop with break:
		for(int e=1; e<=10; e++) {//e=2
				if(e % 2 == 0) {//2%2==0
					System.out.println(e);//2 
					break;
				}
		}
		
		//1 to 100 - even/odd
		//10 to 1 
		
		//char in loop:
		//a-z: 97- 122
		//A-Z:
		for(char c='a'; c<='z'; c++) {
			System.out.println(c+"="+(int)c);//abc...z
		}
		
		//use cases for for loop:
		//number of iterations/cycles are fixed:
		//dropdown - month - 1 to 12 : 
		//footer links: 20
		//calendar: for loop
		
		//3. do-while:
		//at least check the element (logo) first time the moment you land on the page.
		//if element is present --- break the loop.
		
		int v = 1;
		do {
			System.out.println(v);
			v++;
				if(v==5) {
					break;
				}
		}
		while(true);
		
		//4. for each loop: 
		
		
		
	}

}
