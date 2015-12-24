package Collections.JavaSort;

import java.util.Collections;
import java.util.Scanner;

class StudentRazon implements Comparable {
	private int id;
	private String fname;
	private double cgpa;

	public StudentRazon(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

	public int compareTo(Object o) {
		StudentRazon student = (StudentRazon) o;
		if (cgpa == student.cgpa) {
			if (fname.equals(student.fname)) {
				return id - student.id;
			} else {
				return fname.compareTo(student.fname);
			}
		} 
		
		return student.cgpa - cgpa > 0 ? 1:-1;
	}

}

public class JavaSort_Razon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		java.util.ArrayList<StudentRazon> studentList = new java.util.ArrayList<StudentRazon>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			StudentRazon st = new StudentRazon(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		Collections.sort(studentList);
		for (StudentRazon st : studentList) {
			System.out.println(st.getFname());
		}
	}

}
