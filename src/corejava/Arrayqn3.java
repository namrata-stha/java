package corejava;

import java.util.Scanner;

public class Arrayqn3 {
	public static void main(String[] args) {
		
		String[] subjects = {"Nepali","English","Math","Science","Computer","Social","Account"};
		int[] marks =new int[7];
		Scanner sc = new Scanner(System.in);
		
		for (int i =0; i<marks.length; i++) {
			
		    System.out.println("Enter marks of : "+ subjects[i]);
			marks[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int x: marks) {
			sum = sum + x;
		}
		System.out.println("Total Marks = "+sum);
		System.out.println("Percent = "+ sum/7+ "%" );
	}

}
