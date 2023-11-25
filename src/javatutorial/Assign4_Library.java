package javatutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assign4_Library {
 // Add the missing implementation to this class
    
    String address; 
    List<Assign4_Book> bookCollection = new ArrayList<Assign4_Book>() ; 
    
    // constructor
    Assign4_Library(String address){
        this.address = address;
    }
    
    // method 
    
    public void addBook(Assign4_Book newBook) {
        bookCollection.add(newBook);
    }
    
    public void printAddress() {
        System.out.println(this.address);
    }
    
    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm");
    }
    
    public void borrowBook(String bookName) {
        // practice using enhanced for loop 
        for(Assign4_Book book : this.bookCollection) {
            if (book.getTitle().equals(bookName)) {
                if (!book.isBorrowed()) {
                    System.out.println("You successfully borrowed " + book.getTitle());
                    book.borrowed();
                    return; 
                }else {
                    System.out.println("Sorry, this book is already borrowed.");
                    return; 
                }
            }
        }
        
        System.out.println("Sorry, this book is not in our catalog.");
    }
    
    public void printAvailableBooks() {
        
        if(this.bookCollection.size() == 0) {
            System.out.println("No nook in catalog");
            return; 
        }
        // using iterator for practice 
        Iterator<Assign4_Book> itr = this.bookCollection.iterator();
        while(itr.hasNext()) {
            Assign4_Book book = itr.next();
            if(!book.isBorrowed()) {
                System.out.println(book.getTitle());
            }
        }    
    }
    
    public void returnBook(String bookName) {
        // practice just using regular loop
        for(int i = 0; i < this.bookCollection.size(); i++) {
            Assign4_Book book = bookCollection.get(i);
            if(book.getTitle().equals(bookName)) {
                if(book.isBorrowed()) {
                    book.returned();
                    return; 
                }
                else {
                    System.out.println("the book is not borrowed, why u return?");
                    return;
                }
            }
        }
    }
    
    public static void main(String[] args) {
    // Create two libraries
        Assign4_Library firstLibrary = new Assign4_Library("10 Main St.");
        Assign4_Library secondLibrary = new Assign4_Library("228 Liberty St.");
    // Add four books to the first library
    firstLibrary.addBook(new Assign4_Book("The Da Vinci Code"));
    firstLibrary.addBook(new Assign4_Book("Le Petit Prince"));
    firstLibrary.addBook(new Assign4_Book("A Tale of Two Cities"));
    firstLibrary.addBook(new Assign4_Book("The Lord of the Rings"));
   // Print opening hours and the addresses
    System.out.println("Library hours:");
    printOpeningHours();
    System.out.println();
    System.out.println("Library addresses:");
    firstLibrary.printAddress();
    secondLibrary.printAddress();
    System.out.println();
   // Try to borrow The Lords of the Rings from both libraries
    System.out.println("Borrowing The Lord of the Rings:");
    firstLibrary.borrowBook("The Lord of the Rings");
    firstLibrary.borrowBook("The Lord of the Rings");
    secondLibrary.borrowBook("The Lord of the Rings");
    System.out.println();
    // Print the titles of all available books from both libraries
    System.out.println("Books available in the first library:");
    firstLibrary.printAvailableBooks();
    System.out.println();
    System.out.println("Books available in the second library:");
    secondLibrary.printAvailableBooks();
    System.out.println();
    // Return The Lords of the Rings to the first library
    System.out.println("Returning The Lord of the Rings:");
    firstLibrary.returnBook("The Lord of the Rings");
    System.out.println();
   // Print the titles of available from the first library
    System.out.println("Books available in the first library:");
    firstLibrary.printAvailableBooks();
    } 
}
