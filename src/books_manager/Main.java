package books_manager;

import java.util.ArrayList;
import java.util.List;

import books.AudioBook;
import books.Book;
import people.Author;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book audibleBook = new AudioBook("Twisted Prey", "Thriller", new Author("jOHN sTANDFORD"), 28.0, 4, 99 );
System.out.println(audibleBook.toString());

//print out length of this book 
//downcasting from book reference to audiobook reference
System.out.println(((AudioBook)audibleBook).getLength());

List <Book> bookList = new ArrayList<>();

	}

}
