package corejava;

import java.util.Scanner;

public class NestedTest {

	public static void main(String[] args) {

		String citizen;
		int age;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your citizenship");
		citizen = sc.next();
		 
		System.out.println("Enter your age");
		age = sc.nextInt();
		
		if (citizen.equals("nepali")) {
			if (age >= 18) {
				System.out.println("You can vote");
			} else {
				System.out.println("You are under age");
			}
			
		} else {
			System.out.println("You are not nepali");
		}

		
		
	}
}
