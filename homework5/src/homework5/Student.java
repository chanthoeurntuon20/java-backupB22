package homework5;

import java.util.ArrayList;

public class Student extends Book{
	private String firstName;
	private String batch;
	ArrayList<String> bookCart = new ArrayList<String>();
	
	public Student(String firstName, String batch, String title, String author, int publishYear) {
		super(title,author,publishYear);
		this.firstName = firstName;
		this.batch = batch;
		//ArrayList<Book> bookCart = new ArrayList<Book>();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	// borrowBook
	void borrowBook(Book book) {//book as class Book
		//book.returnBack();
		String title = book.getTitle();
		System.out.println(title);
		int size = bookCart.size();
		System.out.println(bookCart);
		if(size < 3) {
			bookCart.add(title);
			//System.out.println(bookCart.toString());
		}else {
			//System.out.println("Cannot borrow more than 3");
		}
		
		
		

	}
	// returnBook
	
	// getBookCart
	
	// toString
	
	
	
}
