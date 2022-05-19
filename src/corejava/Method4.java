package corejava;

public class Method4 {
	public static void main(String[] args) {
		int x = findlargestnumber(500,300);
		   System.out.println("Largest Value = " +x);
	}
	static int findlargestnumber(int x, int y) {
		
		if (x>y) {
			return x;
		}
		return y;
	}
}
