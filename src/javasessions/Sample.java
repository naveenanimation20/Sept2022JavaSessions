package javasessions;

import java.util.Arrays;

public class Sample {
	
	public String name;

	public static String[] test(String name) {

		String d[] = new String[5];

		if (name.equals("naveen")) {
			d = new String[2];
			d[0] = "laptop";
			d[1] = "imac";
		}

		else if (name.equals("sandy")) {
			d = new String[4];
			d[0] = "laptop";
			d[1] = "imac";
			d[2] = "sim";
			d[3] = "mouse";
		} else {
			System.out.println("bye");
			d = new String[0];
		}
		
		return d;

	}

	public static void main(String[] args) {

		String fd[] = test("naveen");
		System.out.println(Arrays.toString(fd));
		System.out.println(fd.length);
		
	}

}

