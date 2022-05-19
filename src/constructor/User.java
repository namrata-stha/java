package constructor;

import java.util.Scanner;

public class User {
	
	   String username;
	   String password;
	   //========== default constructor ====== 
	   
	  User(){
		   username = "test";
	       password = "123";
	   }
	   
// ==== Parameterized constructor ===========
	   User(String un, String psw){
		   
		   
		   username = un;
		   password = psw;
		   
		   //'this' keyword represents current object
	   }
	   
	   void printData() {
		   System.out.println("Username = "+username);
		   System.out.println("Password = "+password);
	   }
	   public static void main(String[] args) {
		   
		//   Scanner sc = new Scanner(System.in);
		//   System.out.println("Enter username");
		//   String uname = sc.next();
		   
		// System.out.println("Enter password");
		 //  String pass = sc.next();
		
		   User u1 = new User("ram","r123");
		   u1.printData();
	}

}
