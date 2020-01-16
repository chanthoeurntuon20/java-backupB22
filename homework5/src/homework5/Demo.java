package homework5;
import java.util.ArrayList;
import java.util.List;
public class Demo {

	public static void main(String[] args) {
		Book book1 = new Book("Don't Make Me Think","Steve Krung",2000);
		Book book2 = new Book("Pro Java Programming","Terrill",2005);
		Book book3 = new Book("Programming in Python 3","Mark Summerfield",2005);
		Book book4 = new Book("The Clean Coder","Robert",2011);
		Book book5 = new Book("The Art of Alile Development","James Shore",2007);
		Book book6 = new Book("Head First Design Patterns","Eric Freeman",2004);
		Book book7 = new Book("The Linux Command Line","Willian",2009);
		Book book8 = new Book("Code Complete","Steve",1993);
		Book book9 = new Book("Unit Test Patterns","Gerard Meszaros",2003);
		Book book10 = new Book("The C++ Programming Language","Bjarne Stroustup",2013);
		book1.borrow();
		
		book2.returnBack();
		book3.borrow();
		book4.borrow();
		book5.returnBack();
		book6.returnBack();
		book7.borrow();
		book8.returnBack();
		book9.returnBack();
		book10.borrow();	
		System.out.println(book1+"\n"+book2+"\n" + book3 +"\n" +book4+"\n" +book5);
		System.out.println(book6+ "\n" + book7+ "\n" + book8+ "\n" + book9+ "\n" + book10);

		List<Book> books = new ArrayList <>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		books.add(book8);
		books.add(book9);
		books.add(book10);
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println(String.format("%30s %20s %10s %20s", "TITLE","AUTHOR","YEAR","STATUS"));
		System.out.println("----------------------------------------------------------------------------------------");
		for(Book Book : books) {
			///check it here
			String borrowBook;
			boolean isCheck = Book.isBorrowed(); // this function return true or false
			if(isCheck) {
			borrowBook = "Not available";
			}else {
			borrowBook = "Available";
			}
			System.out.format("%30s %20s %10s %20s",
					Book.getTitle(),Book.getAuthor(),Book.getPublishYear(),borrowBook);
			System.out.println();
		}
		// student
		System.out.println("---------------------------------------------");
		Student st = new Student("a", "2020B", "lala", "me", 2020);
		st.borrowBook(book1);
		st.borrowBook(book2);
		st.borrowBook(book3);
		st.borrowBook(book4);
		st.borrowBook(book5);
		st.borrowBook(book6);
		st.borrowBook(book7);
		st.borrowBook(book8);
		st.borrowBook(book9);
		st.borrowBook(book10);
		

	}

}
