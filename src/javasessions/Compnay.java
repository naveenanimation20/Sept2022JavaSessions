package javasessions;

import java.util.Arrays;

public class Compnay {

	// AC:
	// WAF:
	// getEmployeeDevices()
	// input param: employeeName(String)
	// return: all the devices -- Array -- devicename(string)

	public String[] getEmployeeDevices(String empName) {
		System.out.println("getting employee devices for employee name: " + empName);

		String devices[] = new String[5];

		if (empName.equals("naveen")) {
			devices[0] = "macbook pro";
			devices[1] = "ipad";
			devices[2] = "mouse";
			devices[3] = "keyboard";
			devices[4] = "iphone14";
		} else if (empName.equals("swathi")) {
			devices[0] = "dell laptop";
			devices[1] = "samsung 7";
			devices[2] = "mouse";
		} else if (empName.equals("aman")) {
			devices[0] = "macbook air";
			devices[1] = "iphone 13";
		} else {
			System.out.println("emp name is not found...." + empName);
		}

		return devices;

	}

	public static void main(String[] args) {
		Compnay co = new Compnay();
		String d1[] = co.getEmployeeDevices("aman");
		System.out.println("emp devices count: " + d1.length);
		System.out.println(Arrays.toString(d1));
	}

}
