package oop;

public class Book {
	    
	    String name;
	    int pages;
	    String author;
	    int price;
	        
	    void printBookInfo() {
	    	System.out.println("Name= "+name);
	    	System.out.println("Author= "+author);
	    	System.out.println("Price= "+price);
	    	System.out.println("Pages= "+pages);
	    }
	    public static void main(String[] args) {
			
	    	Book b = new Book();
	    	
	    	b.name ="Math";
	    	b.author ="R.K Singh";
	    	b.price = 500;
	    	b.pages = 900;
	    	
	    	b. printBookInfo();
		}

}
