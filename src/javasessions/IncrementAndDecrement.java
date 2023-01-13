package javasessions;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		// ++
		// --
		// 1. post increment:
		int a = 1;
		int b = a++;
		System.out.println(a);// 2
		System.out.println(b);// 1

		int g = -98;
		int h = g++;
		System.out.println(g);
		System.out.println(h);

		// 2. pre increment:
		int c = 1;
		int d = ++c;
		System.out.println(c);// 2
		System.out.println(d);// 2

		int t = -99;
		int p = ++t;
		System.out.println(t);// -98
		System.out.println(p);// -98

		// 3. post decrement:
		int k = 2;
		int m = k--;
		System.out.println(k);// 1
		System.out.println(m);// 2

		// pre decrement:
		int e = 2;
		int f = --e;
		System.out.println(e);// 1
		System.out.println(f);// 1

		int u = 2;
		System.out.println(u++);// 2
		System.out.println(u);// 3

		int w = 2;
		System.out.println(++w);
		System.out.println(w);

	}

}
