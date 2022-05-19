package javastring;

public class PhoneValidation {
    public static void main(String[] args) {
		     String reg = "[9][8][0][0-9]{7}";
		     
		     String phone = "9809039667";
		     
		     System.out.println(phone.matches(reg));
	}
}
