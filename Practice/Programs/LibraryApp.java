import java.util.ArrayList;
import java.util.Scanner;
class Book {
    private String title;
    private boolean isAvailable;

    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return title + " - " + (isAvailable ? "Available" : "Borrowed");
    }
}


class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        books.add(new Book("The Alchemist"));
        books.add(new Book("Clean Code"));
        books.add(new Book("Java Basics"));
    }

    public void showBooks() {
        System.out.println("Books in Library:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    public void borrowBook(int index) {
        if (index >= 0 && index < books.size()) {
            Book book = books.get(index);
            if (book.isAvailable()) {
                book.borrow();
                System.out.println("You borrowed: " + book.getTitle());
            } else {
                System.out.println("Book is already borrowed.");
            }
        } else {
            System.out.println("Invalid book number.");
        }
    }

    public void returnBook(int index) {
        if (index >= 0 && index < books.size()) {
            Book book = books.get(index);
            if (!book.isAvailable()) {
                book.returnBook();
                System.out.println("You returned: " + book.getTitle());
            } else {
                System.out.println("Book was not borrowed.");
            }
        } else {
            System.out.println("Invalid book number.");
        }
    }

    public void searchBook(String name) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(name)) {
                System.out.println("Found: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }
}


public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Book by Name");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> library.showBooks();
                case 2 -> {
                    System.out.print("Enter book number to borrow: ");
                    int num = sc.nextInt();
                    library.borrowBook(num - 1);
                }
                case 3 -> {
                    System.out.print("Enter book number to return: ");
                    int num = sc.nextInt();
                    library.returnBook(num - 1);
                }
                case 4 -> {
                    System.out.print("Enter book name to search: ");
                    String name = sc.nextLine();
                    library.searchBook(name);
                }
                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}
