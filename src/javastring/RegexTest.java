package javastring;

public class RegexTest {
	public static void main(String[] args) {
		String reg1 = "[0-9]+";
	   String value = "9788545887";
	   System.out.println(value.matches(reg1));
	}

}
