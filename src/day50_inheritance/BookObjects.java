package day50_inheritance;

public class BookObjects {

    public static void main(String[] args) {

        Book book = new Book();

        book.title = "intro to java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 85.0;

        System.out.println(book.price);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.title);

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh";
        audioBook.length = 60;
        audioBook.narrator = "Irina";
        audioBook.price = 44.99;
        audioBook.title = "Selenium CookBook";
        audioBook.type = "Automation";
        audioBook.listen();
    }
}
