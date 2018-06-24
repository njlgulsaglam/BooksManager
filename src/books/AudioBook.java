package books;

import people.Author;

//inheritance
public class AudioBook extends Book{
  
		// TODO Auto-generated constructor stub

	  private int rating;
	    private int length;

	    public AudioBook(String title, String genre, Author author, double price, int rating, int length) {
	      //Call Book class's constructor
	      super(title, genre, author, price);
	      this.rating = rating;
	      this.length = length;
	    }


	    public int getRating() {
	      return rating;
	    }


	    public void setRating(int rating) {
	      this.rating = rating;
	    }


	    public int getLength() {
	      return length;
	    }


	    public void setLength(int length) {
	      this.length = length;
	    }
	    
	    
	    
	    //super.toString to call superclass

	    @Override
	    public String toString() {
	      return super.toString() + "rating= " + rating + ", length= " + length;
	    }
	  
	  
	  
}