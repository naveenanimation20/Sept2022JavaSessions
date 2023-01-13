package javasessions;

public class DataTypesConcept {

	public static void main(String[] args) {

		// hi this is my java code and im so happy today
		// data types:

		// Primitive data types: No need to create the Object

		// Boolean: boolean: true/false
		// Numeric Type:
		// A. Integral Type:
		// 1. Integer: byte, short, int, long
		// 2. Floating-point: float, double
		// B. Character: char -- 'A', 'B', '$'

		// Non Primitive data types: class, array, interface, abs class

		// 1. byte:
		// range: -128 to 127 --> -2^7 tp +2^7+1
		// size: 1 byte = 8 bits
		byte b = 10;
		System.out.println(b);

		b = 30;
		System.out.println(b);

		byte c = 20;
		System.out.println(c);
		byte d = 40;
		System.out.println(d + 10);// 50

		byte e = 0;
		byte h = -10;

		byte b1 = 10;
		byte b2 = 20;
		int b3 = b1 + b2;
		System.out.println(b3);

		// 2. short:
		// range: -32767 to 32768 --> -2^15 to +2^15+1
		// size: 2 bytes = 2x8 = 16 bits
		short sh = 400;
		short gh = 4000;
		int sum = sh + gh;
		System.out.println(sum);

		// 3. int:
		// range: -2147483648 to 2147483647 --> -2^31 to +s^31+1
		// size: 4 bytes = 4x8 = 32 bits
		int i = 10;
		int num = 909090;
		int total = 2345678;
		System.out.println(i);
		System.out.println(num + i);
		// int lp = 12.33;

		// 4. long:
		// range: -2^63 to +2^63+2
		// size: 8 bytes = 8x8 = 64 bits
		long l = 2121212121;
		long dist = 89898989887776L;
		System.out.println(dist);

		// mobile num, CC, debit, AAdhar card, SSN, ACC number
		// Strings:
		// long mob = 9898987654L;

		// 5. float:
		// size: 4 bytes = 32 bits
		// range: upto 7 decimal digits
		float f = 12.33f;
		float f1 = (float) 34.44;
		System.out.println(f);
		System.out.println(f1);

		float f2 = 100;
		System.out.println(f2);

		// 6. double:
		// size: 8 bytes = 64 bits
		// range: upto 15 decimal digits
		double d1 = 12.333333d;
		double d2 = 1.222232222;

		// 7. char:
		// single digit value
		// size: 2 bytes = 16 bits
		// range:
		// a-z: 97 to 122
		// A-Z: 65 to 90
		// 0-9: 48 to 57
		char c1 = 'a';// 97
		char s1 = 'b';// 98
		char c2 = '1';
		char c3 = '$';
		char c4 = 'A';

		System.out.println(c1);// a
		System.out.println(c3);// $
		System.out.println(c1 + s1);// 97+98 = 195
		System.out.println(c1 - s1);// 97-98 = -1

		System.out.println((int) c1);
		System.out.println((int) c4);
		System.out.println((byte) 'a');

		System.out.println(100);
		System.out.println(12.33);

		// boolean: true/false
		// size: ~1 bit
		boolean br = true;
		boolean br1 = false;
		boolean userIsActive = true;
		boolean isPermanent = false;
		boolean flag = true;

		int myEmpIdNumber = 101;

		//
		String ip = "192.189.10.11";
		String cc = "1234 12121 21212 2121";
		
		char z = 'x';
		System.out.println((int)z);

	}

}
