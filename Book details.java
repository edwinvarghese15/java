import java.util.Scanner
class Publisher {
    String publisherName;

    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }

    public void display() {
        System.out.println("Publisher: " + publisherName);
    }
}
class Book extends Publisher {
    String title, author;
    double price;

    public Book(String publisherName, String title, String author, double price) {
        super(publisherName);
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}


class Literature extends Book {
    public Literature(String publisherName, String title, String author, double price) {
        super(publisherName, title, author, price);
    }

    @Override
    public void display() {
        System.out.println("\n--- Literature Book Details ---");
        super.display();
    }
}
class Fiction extends Book {
    public Fiction(String publisherName, String title, String author, double price) {
        super(publisherName, title, author, price);
    }

    @Override
    public void display() {
        System.out.println("\n--- Fiction Book Details ---");
        super.display();
    }
}
public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Literature Book Details:");
        System.out.print("Publisher Name: ");
        String pubLit = sc.nextLine();
        System.out.print("Title: ");
        String titleLit = sc.nextLine();
        System.out.print("Author: ");
        String authorLit = sc.nextLine();
        System.out.print("Price: ");
        double priceLit = sc.nextDouble();
        sc.nextLine(); 

        Literature literatureBook = new Literature(pubLit, titleLit, authorLit, priceLit);


        System.out.println("\nEnter Fiction Book Details:");
        System.out.print("Publisher Name: ");
        String pubFic = sc.nextLine();
        System.out.print("Title: ");
        String titleFic = sc.nextLine();
        System.out.print("Author: ");
        String authorFic = sc.nextLine();
        System.out.print("Price: ");
        double priceFic = sc.nextDouble();

        Fiction fictionBook = new Fiction(pubFic, titleFic, authorFic, priceFic);


        literatureBook.display();
        fictionBook.display();

        sc.close();
    }
}
