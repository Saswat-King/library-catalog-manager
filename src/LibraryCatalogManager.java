import java.util.Scanner;

class Book
{
    private String title;
    private int bookId;

    Book(String title,int bookId)
    {
        this.title = title;
        this.bookId = bookId;
    }


    String getTitle()
    {
        return title;
    }

    int getBookId() {
        return bookId;
    }
}



public class LibraryCatalogManager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println(" 📚 Welcome to Library Catalog Manager ");
        System.out.println("=======================================");

        System.out.println();
        System.out.print("Enter number of books: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        Book[] books = new Book[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter title of book " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter ID of book " + (i + 1) + ": ");
            int id = scanner.nextInt();
            scanner.nextLine();

            books[i] = new Book(name, id);
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < num; i++) {
            System.out.println("Title: " + books[i].getTitle() + ", ID: " + books[i].getBookId());
        }

        System.out.println();

        System.out.print("Enter ID to search: ");
        int search = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter title to search: ");
        String title = scanner.nextLine();

        System.out.println();
        searchBookById(search, books);
        searchBookByTitle(title, books);
        System.out.println();
    }

    static void searchBookById(int id, Book[] books) {
        boolean found = false;
        for (int i = 0; i < books.length; i++) {


            if(id == books[i].getBookId())
            {
                System.out.println("Search by ID:-");
                System.out.println("Book with ID "+ id+": "+books[i].getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + id + " not found.");
        }
        System.out.println();
    }


    static void searchBookByTitle(String title, Book[] books) {
        boolean found = false;

        for (int i = 0; i < books.length; i++) {

            if(title.equalsIgnoreCase(books[i].getTitle()))
            {
                System.out.println("Search by Title:-");
                System.out.println("Book with title \""+title+"\" : "+books[i].getBookId());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book with title \"" + title + "\" not found.");
        }
    }

}


