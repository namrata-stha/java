package corejava;

import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {

		int marks;
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter your marks");
		marks = sc.nextInt();

		if (marks >= 80) {
			System.out.println("Distinction");

		} else if (marks >= 60) {
			System.out.println("First Division");

		} else if (marks >= 45) {
			System.out.println("Second Division");

		} else if (marks >= 32) {
			System.out.println("Thirs Division");
		} else {
			System.out.println("Failed");
		}
	}
}
