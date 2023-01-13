package javasessions;

import java.util.Map;
import java.util.TreeMap;

public class SwitchCaseLogic {

	public static void main(String[] args) {

//		String browser = "Chrome";
//
//		switch (browser.toLowerCase()) {
//		case "chrome":
//			System.out.println("launch chrome");
//
//			String version = "105";
//			switch (version) {
//			case "105":
//				System.out.println("launch chrome v 105");
//				break;
//
//			default:
//				break;
//			}
//
//			break;
//		case "firefox":
//			System.out.println("launch firefox");
//			break;
//		case "edge":
//			System.out.println("launch edge");
//			break;
//		case "ie":
//			System.out.println("launch ie");
//			break;
//
//		default:
//			System.out.println("please pass the right browser...." + browser);
//			break;
//
//		case "brave":
//			System.out.println("launch brave");
//			break;
//		}

		//
		int marks = 95;
		switch (marks) {
		case 90:
			System.out.println("GRADE A");
			break;
		case 80:
			System.out.println("GRADE B");
			break;
		case 100:
			System.out.println("GRADE A++");
			break;

		default:
			System.out.println("FAIL");
			break;
		}

		// cross browser testing
		// weekdays - mon to sunday
		// env - dev, qa, stage, prod, uat
		// switch - case with float/double/boolean/long -- wont work

		char c = 'a';

		switch (c) {
		case 'a':
			System.out.println(" a is vowel");
			break;
		case 'e':
			System.out.println(" e is vowel");
			break;
		case 'i':
			System.out.println(" i is vowel");
			break;
		case 'o':
			System.out.println(" o is vowel");
			break;
		case 'u':
			System.out.println(" u is vowel");
			break;

		default:
			System.out.println("not a vowel");
			break;
		}
		
		//
//		String day = "monday";
//		switch (day.toLowerCase()) {
//		case "Monday":
//		System.out.println("Monday.. its working day");
//		break;
//		case "Tuesday":
//		System.out.println("Tuesday... its working day");
//		break;
//		case "Wednesday":
//		System.out.println("Wednesday.... its working day");
//		break;
//		case "Thursday":
//		System.out.println("Thursday.... its working day");
//		break;
//		case "Friday":
//		System.out.println("Friday.... its working day");
//		break;
//		case "Saturday":
//		System.out.println("Saturday.... its weekend");
//		break;
//		case "Sunday":
//		System.out.println("Sunday.... it's party day");
//		break;
//
//		default:
//		System.out.println("please pass the right day..." +day);
//		break;
//		}
		
		//
		
//		String browser ="Chrome";
//		switch (browser) {
//		case "chrome":
//			System.out.println("Launch Browser:" + browser);
//			break;
//		case "firefox":
//			System.out.println("Launch Browser:" + browser);
//			break;
//		case "edge":
//			System.out.println("Launch Browser:" + browser);
//			break;
//		case "ie":
//			System.out.println("Launch Browser:" + browser);
//			break;
//		default:
//			System.out.println("Please Enter the Corect browser ..." +browser);
//			break;
//		}
		
		
			//banana
		System.out.println("b"+"a"+String.valueOf(0.0/0.0).toLowerCase()+"a");
		
		

	}

}
