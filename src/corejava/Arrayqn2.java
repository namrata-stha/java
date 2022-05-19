package corejava;

import java.util.Scanner;

public class Arrayqn2 {
	public static void main(String[] args) {
		  
		int bookprice[] =new int[5];
		int s=0;
		 
		Scanner sc = new Scanner (System.in);
		
		for (int i=0; i<bookprice.length; i++) {
			System.out.println("Enter Book Price");
			bookprice[i] = sc.nextInt();
		}
		
		for(int x : bookprice) {
			System.out.println(x);
			
			s=s+x;
		}
		
	System.out.println("Total="+s);
			
	}
}


		


