package homework5;

public class Book {
	//Declare variable
	private String title;
	private String author;
	private int publishYear;
	private boolean isBorrowed = true;
    //Create constructor have 3 parameter
	public Book(String title,String author,int publishYear){
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;		
	}
	//Return true if book borrow
	void borrow(){
		isBorrowed = true;	
	}
	//Return false if book not borrow
	void returnBack(){
		isBorrowed= false;
	}
	//getTitle
	String getTitle(){
		return title;
	}
	String getAuthor() {
		return author;
	}
	int getPublishYear() {
		return publishYear;
	}
	boolean isBorrowed(){
//		if(isBorrowed) {
//			isBorrowed = true;
//		}else {
//			isBorrowed = false;
//		}
		return isBorrowed;
	}
	public String toString() {
		String borrowBook;
		boolean isCheck = isBorrowed(); // this function return true or false
		// end
		if(isCheck) {
		borrowBook = "Not available to borrow";
		}else {
		borrowBook = "Available to borrow";
		}
		
		return "Title: " + title + " " + " \n"+"\t"+"by"+" "+ author + " "+"--pulished"+ " "+ publishYear + "\n\t" +"Status:"+ " "+ borrowBook;

	}
}