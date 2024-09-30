import java.util.*;
public class Book {
    private String name,isbn,author,publisher;
    public Book(String name, String isbn, String author, String publisher) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void setPublisher(String newPublisher) {
        publisher = newPublisher;
    }
    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
    public String getBookInfo() {
        return "Book Name: " + name +"\nISBN Number: " + isbn +"\nAuthor Name: " + author + "\nPublisher: " + publisher;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter book name: ");
        String name = sc.nextLine();

        System.out.print("Enter ISBN number: ");
        String isbn = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        System.out.print("Enter publisher: ");
        String publisher = sc.nextLine();

        
        Book book = new Book(name, isbn, author, publisher);

        System.out.println("\nBook Information:");
        System.out.println(book.getBookInfo());
    }
}