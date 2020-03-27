package practice;

public class Library {
 
	private String address;
	private static int opentime=9;
	private static int closetime=5;
	Book[] books= new Book[100];
	int num=0;
	
	public Library(String saddress) {
		address=saddress;
	}
	void printAddress() {
		System.out.println(address);
	}
	
	public static void printOpeningHours(){
		System.out .println("Libraries are open daily from "+opentime+"am to "+closetime+"pm");
	}
	void addBook(Book book) {
		books[num]=book;
		num++;
		if(num==100)System.out.println("The Library is full");
	}
	
	void borrowBook(String title) {
		int flag=0;
		for(int j=0;j<num;j++){
			if(books[j].title.equals(title)&&books[j].borrowed==false) {
				System.out.println("You successfully borrowed "+title);
				books[j].borrowed=true;flag=1;
			}
			else if((books[j].title.equals(title)&&books[j].borrowed==true)) {
				System.out.println("Sorry, this book is already borrowed.");
				flag=1;
			}
			else continue;
		}
		if(flag==0)System.out.println("Sorry, this book is not in our catalog.");
	}
	
	void returnBook(String title) {
		for(int j=0;j<num;j++){
			if(books[j].title.equals(title)&&books[j].borrowed==true) {
				System.out.println("You successfully returned "+title);
				books[j].borrowed=false;
			}
		}
	}
	
	
	void printAvailableBooks() {
		for(int j=0;j<num&&books[j].borrowed==false;j++)
			System.out.println(books[j].title);
		if(books[0]==null)System.out.println("No book in catalog");
	}
	
	
	
	
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

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
class Book{

    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
    	title=bookTitle;
    }
   
    // Marks the book as rented
    public void rented() {
        if(borrowed==false)
        	borrowed=true;
    }
   
    // Marks the book as not rented
    public void returned() {
    	if(borrowed==true)
        	borrowed=false;
    	}
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return borrowed;
    }
   
    // Returns the title of the book
    public String getTitle() {
        return title;
    }
}