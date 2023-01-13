package StringConcept;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		
		String s = "testing";
		String s1 = "100";
		String str = "hello hi this is my java code and i am so happy";
		
		System.out.println(str.length());
		System.out.println(s.length());
		
		int len = str.length();
		int li = 0;
		int hi = len-1;
		System.out.println("LI = " + li);
		System.out.println("HI = " + hi);
		System.out.println("length = " + len);
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(40));
		//System.out.println(str.charAt(41));//SIOB

		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf('i'));//1st occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//2nd occurrence of i
		
		System.out.println(str.indexOf("java"));//20
		System.out.println(str.indexOf("python"));//-1
		
		String mesg = "Welcome Naveen";
		if(mesg.indexOf("Naveen") != -1) {
			System.out.println("user name is present");
		}
		else {
			System.out.println("not present");
		}
		
		//comparison:
		//String literals - SCP
		String t1 = "hello world";//scp -1
		String t2 = "hello world";//0
		
		System.out.println(t1.equals(t2));//true
		System.out.println(t1.equalsIgnoreCase(t2));
		System.out.println(t1 == t2);
		
		String t3 = new String("hello naveen");//2 -- heap + SCP
		String t4 = "hello naveen";//0
		
		String t5 = new String("hello world");//heap ---1
		
		String t6 = "hello world";//0
		String t7 = "hello world";//0
		
		System.out.println(t3 == t4);
		System.out.println(t3.equals(t4));
		System.out.println(t1 == t6);
		System.out.println(t2 == t7);

		String t8 = new String("hello python");//2 -- heap + SCP
		
		//
		String p1 = "hello testing";
		p1 = p1+"java";
		System.out.println(p1);		
		String p3 = "hello testing";
		
		String l1 = "selenium";
		System.out.println(l1.toUpperCase());
		
		 l1 = l1.toUpperCase();
		System.out.println(l1);
		
		System.out.println(p1.toLowerCase());
		System.out.println(p1.toUpperCase());
		
		//contains:
		String pop = "hello amazon application";
		System.out.println(pop.contains("amazon"));
		
		//trim
		String h1 = "   hello world    ";
		System.out.println(h1.trim());
		
		//replace:
		String h2 = "hello world";
		System.out.println(h2.replace(" ", ""));
		
		String dob = "01-01-1990";//01/01/1990
		String newDOB = dob.replace("-", "/");
		System.out.println(newDOB);
		
		String st1 = "hello hi this is my java code and i am so happy";
		System.out.println(st1.replace("i", " "));
		
	
		StringBuilder sb1 = new StringBuilder("Naveen");
		StringBuilder sb2 = new StringBuilder("Naveen");

//		sb1.append("Automation");
//		System.out.println(sb1);
		
		System.out.println(sb1.equals(sb2));//false
		System.out.println(sb1==sb2);//false
		
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		String pl = "Selenium";
		StringBuilder sp1 = new StringBuilder(pl);
		sp1.append("testing");
		System.out.println(sp1);
		
		
		//split:
		String sl = "java_python_ruby_dotnet";
		String sp[] = sl.split("_");
		
		System.out.println(sp[0]);
		System.out.println(sp[3]);
		//System.out.println(sp[4]);

		String pool = "xXtestingxXseleniumXxXJavaXXxXAutomationX";
		String arr[] = pool.split("xX");
		
		System.out.println(arr[0]);//0
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		String data = "tom;peter;30;pune;India;SDET1";
		String d[] = data.split(";");
		System.out.println(Arrays.toString(d));
		
		//1: SB:
		String test = "Selenium";//muineleS
		StringBuilder stb = new StringBuilder(test);
		stb.reverse();
		System.out.println(stb);
		
		//2. 
		int length = test.length();//8
		String rev = "";
		for(int i=length-1; i>=0; i--) {
			rev = rev + test.charAt(i);//muineleS
		}
		System.out.println(rev);
		
		//subString:
		String messg = "your username is naveenautomation123";
//		String newStr = messg.substring(7);	
//		System.out.println(newStr);
		
//		String newStr = messg.substring(7, 20);
//		System.out.println(newStr);
		
		String newStr = messg.substring(messg.indexOf("is")+3, messg.length());
		System.out.println(newStr);
		
		String uid = messg.substring(messg.indexOf("is")+3);
		System.out.println(uid);
		
		//String m1 = "your id is testautomation so plz login to app";
		
	}

}
