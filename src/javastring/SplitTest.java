package javastring;

public class SplitTest {
	public static void main(String[] args) {
		
		String s = "java developers in nepal";
		String[] words = s.split("\\s"); 
		 int cnt = 0;
		 
		 for(String w : words) {
			 System.out.println(w);
			 
			 if (w.equalsIgnoreCase("nepal")) {
				 cnt++;
			 }
		 }
		 System.out.println(cnt);
	}

}
