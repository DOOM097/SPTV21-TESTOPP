package sptv21testoop;

import myclasses.Author;
import myclasses.Book;

public class App {
    
    public void run(){
        Book book = createBook("Yevhenii Onegin");
        book.addAuthor(createAuthor("Aleksandr", "Pushkin"));
        System.out.println(book);

        Book book2 = createBook("3oJIotoi_TeJIbonok");
        book2.addAuthor(createAuthor("Ilja", "Ilf"));
        book2.addAuthor(createAuthor("Yevhenii", "Petrov"));
        System.out.println(book2);

        Book book3 = createBook("3aTToBiT");
        book3.addAuthor(createAuthor("Taras","Shevchenko"));
        System.out.println(book3);
    }
    private Book createBook(String caption){
        Book book = new Book();
        book.setCaption(caption);
        return book;
    }
    private Author createAuthor(String firstname, String lastname){
        Author author = new Author();
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }
}
