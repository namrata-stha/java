package corejava;

public class MethodTest {
    
	public static void main(String[] args) {
		
		//sum();
		//FindFactorial(7);
		//int a = FindSumof1to100();
	  // System.out.println("Sum of 1 to 100 =" +a);
	   
	   int x = findsmallestvalue(500,300);
	   System.out.println("Smallest Value = " +x);
	}
	
	//1. no return type with no arguments 
    static void sum() {
		
		int a= 700;
		int b= 500;
		
		int c = a+b;
		System.out.println(c);
	}
    
	
    //2. no return type with arguments
    
    static void FindFactorial(int n) {
    	
    	int fact =1;
    	while(n > 1) {
    		fact= fact*n;
    		n--;
    	}
    	System.out.println("Factorial = "+ fact);
    	
    }
    
    //3. return type with no arguments
    
    static int FindSumof1to100() {
    	 
    	 int s = 0;
    	 for(int i=1;i<=100;i++) {
    		 
    		 s = s + i;
    	 }
    	 return s;
     }
    //4. return type with arguments
   static int findsmallestvalue(int x, int y) {
    	 
    	if (x>y) {
    		return x;
    	}
    	
    	return y;
    }
 }
