package net.konic.constructorstatics;
class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
    }

    void printDetails() {
        System.out.println(title + " - " + author);
    }
}

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("Java", "James");

        Book book2 = new Book(book1);

        book1.printDetails();          
        book2.printDetails();          
    }
}
