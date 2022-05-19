package oop;

import java.util.Scanner;

public class Students {
	String firstname;
	String lastname;
	int year;
	String major;
	
	void printStudentsInfo() {
		System.out.println("firstname = "+firstname);
		System.out.println("lastname = "+lastname);
		System.out.println("year = "+year);
		System.out.println("major = "+major);
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Students s1 = new Students ();
		System.out.println("firstname = ");
		s1.firstname =sc.next();
		System.out.println("lastname = ");
		s1.lastname =sc.next();
		System.out.println("year = ");
		s1.year =sc.nextInt();
		System.out.println("major = ");
		s1.major =sc.next();
		 
		Students s2 = new Students ();
		System.out.println("firstname = ");
		s2.firstname =sc.next();
		System.out.println("lastname = ");
		s2.lastname =sc.next();
		System.out.println("year = ");
		s2. year =sc.nextInt();
		System.out.println("major = ");
		s2.major =sc.next();
		
		s1.printStudentsInfo();
		s2.printStudentsInfo();
	}

}
