package corejava;

import java.util.Arrays;

public class ArraySortTest {
	public static void main(String[] args) {
		 
		int [] data = {10,20,30,40,50,60,50,60,70};
		
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		System.out.println("========Reverse order======");
		for(int i=data.length-1; i>=0; i--) {
			System.out.print(data[i]+"\t");
		}
	}

}
