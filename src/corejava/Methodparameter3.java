package corejava;

import java.util.Scanner;

public class Methodparameter3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter priniple = ");
		int p= sc. nextInt();
		
		System.out.println("Enter time = ");
		int t = sc.nextInt();
		
		System.out.println("Enter rate = ");
		int r = sc.nextInt();
		
		SI(p, t, r);
		
		
	}
	 static void SI(int p,int t,int r) {
		 int a = p*t*r/100;
		System.out.println(a);
	}
	

}
