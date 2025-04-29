// LibraryManagement.java

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true; // Initially, the book is available
    }

    public boolean borrow() {
        if (this.available) {
            this.available = false;
            return true;
        }
        return false;
    }

    public void returnBook() {
        this.available = true;
    }

    @Override
    public String toString() {
        return "Book Title: " + this.title + ", Author: " + this.author + ", ISBN: " + this.isbn + ", Available: "
                + this.available;
    }
}

class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.borrow()) {
            borrowedBooks.add(book);
            System.out.println(this.name + " has borrowed '" + book.toString() + "'");
        } else {
            System.out.println("Sorry, '" + book.toString() + "' is currently unavailable.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(this.name + " has returned '" + book.toString() + "'");
        } else {
            System.out.println(this.name + " did not borrow '" + book.toString() + "'.");
        }
    }

    @Override
    public String toString() {
        StringBuilder borrowedBooksList = new StringBuilder();
        for (Book book : borrowedBooks) {
            borrowedBooksList.append(book.toString()).append(", ");
        }
        return "Member Name: " + this.name + ", Member ID: " + this.memberId + ", Borrowed Books: "
                + borrowedBooksList.toString();
    }
}

class LibrarySystem {
    private List<Book> books;
    private List<Member> members;

    public LibrarySystem() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void listBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void listMembers() {
        System.out.println("Library Members:");
        for (Member member : members) {
            System.out.println(member.toString());
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        // Create a library system
        LibrarySystem library = new LibrarySystem();

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create a member
        Member member1 = new Member("John Doe", "M001");

        // Add member to the library system
        library.addMember(member1);

        // List books and members
        library.listBooks();
        library.listMembers();

        // Member borrows a book
        member1.borrowBook(book1);
        member1.borrowBook(book2);

        // List books after borrowing
        library.listBooks();

        // Member returns a book
        member1.returnBook(book1);

        // List books after returning
        library.listBooks();
    }
}
