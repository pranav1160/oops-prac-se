
// dentify commonalities and differences between Publication, Book and Magazine classes. Title,
// Price, Copies are common instance variables and saleCopy is common method. The differences
// are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty, Current issue,
// receiveissue().Write a program to find how many copies of the given books are ordered and
// display total sale of publication.

// Parent Class: Publication
class Publication {
    String title;
    double price;
    int copies;

    // Constructor
    Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    // Sale Calculation
    double saleCopy() {
        return copies * price; // Total price for sold copies
    }

    // Display Publication details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Copies: " + copies);
    }
}

// Subclass: Book
class Book extends Publication {
    String author;

    // Constructor for Book
    Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    // Order additional copies
    void orderCopies(int additionalCopies) {
        copies += additionalCopies; // Update the total copies
        System.out.println(additionalCopies + " copies ordered. Total copies: " + copies);
    }

    // Display Book details
    @Override
    void display() {
        super.display();
        System.out.println("Author: " + author);
    }
}

// Subclass: Magazine
class Magazine extends Publication {
    String issue;

    

    // Constructor for Magazine
    Magazine(String title, double price, int copies, String issue) {
        super(title, price, copies);
        this.issue = issue;
    }

    // Order additional quantities for magazines
    void orderQty(int qty) {
        copies += qty; // Update the total copies
        System.out.println(qty + " magazines ordered. Total copies: " + copies);
    }

    // Receive the latest issue
    void receiveIssue(String newIssue) {
        this.issue = newIssue;
        System.out.println("New issue \"" + newIssue + "\" has been received.");
    }

    // Display Magazine details
    @Override
    void display() {
        super.display();
        System.out.println("Current Issue: " + issue);
    }
}

// Main Class
public class second {
    public static void main(String[] args) {

        

        // Book Instance
        Book book1 = new Book("Java Programming", 500.0, 10, "Herbert Schildt");
        book1.display();
        book1.orderCopies(5); // Order additional copies
        System.out.println("Total Sale for Book: " + book1.saleCopy());
        System.out.println();

        // Magazine Instance
        Magazine mag1 = new Magazine("Tech World", 150.0, 20, "August 2024");
        mag1.display();
        mag1.orderQty(10); // Order additional copies
        mag1.receiveIssue("September 2024");
        mag1.display();
        System.out.println("Total Sale for Magazine: " + mag1.saleCopy());

       
    }
}
