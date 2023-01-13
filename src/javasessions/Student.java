package javasessions;

public class Student {

	// AC: 0 - 100
	// WAF: pass the student name(String) as input parameter
	// return student marks (int)
	// else print a mesg -> student not found...return ?

	public int getStudentMarks(String studentName) {

		System.out.println("getting marks for student: " + studentName);
		int marks = -1;

		if (studentName.equals("Aman")) {
			//return 90;
			marks = 90;
		} 
		else if (studentName.equals("Rekha")) {
			//return 95;
			marks = 95;
		} 
		else if (studentName.equals("Ajith")) {
			//return 100;
			marks = 100;
		}

		else {
			System.out.println("student name is not found...." + studentName);
			//return -1;
		}
		
		return marks;
	}

	public static void main(String[] args) {
		
		Student st = new Student();
		int m1 = st.getStudentMarks("Aman");
		System.out.println(m1);
		
		int m2 = st.getStudentMarks("Naveen");
		System.out.println(m2);
			if(m2 == -1) {
				System.out.println("no need to print the marks sheet");
			}
	}

}
