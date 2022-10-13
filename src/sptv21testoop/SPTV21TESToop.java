
package sptv21testoop;

import myclasses.Author;
import myclasses.Book;

public class SPTV21TESToop {

    public static void main(String[] args) {
        Author author1= new Author();
        author1.setFirstname("Aleksandr");
        author1.setLastname("Pushkin");
        Book book1=new Book();
        book1.setCaption("Yevhenii Onegin");
        Author[] authors= new Author[1];
        authors[0]= author1;
        book1.setAuthors(authors);
        System.out.println(book1.toString());
        
        Author author2= new Author();
        author2.setFirstname("Ilja");
        author2.setLastname("Ilf");
        Author author3= new Author();
        author3.setFirstname("Yevhenii");
        author3.setLastname("Petrov");
        Book book2=new Book();
        Author[] authors2= new Author[2];
        authors2[0]= author2;
        authors2[1]= author3;
        book2.setAuthors(authors2);
        book2.setCaption("3oJIotoi_TeJIbonok");
        System.out.println(book2.toString());
        
        Author author4= new Author();
        author4.setFirstname("Taras");
        author4.setLastname("Shevchenko");
        Book book3 = new Book();
        book3.addAuthor(author4);
        book3.setCaption("3aTToBiT");
        System.out.println(book3.toString());
        
        Author author5= new Author();
        author5.setFirstname("Oleg");
        author5.setLastname("Hirjanow");
        Author author6= new Author();
        author6.setFirstname("Timofei");
        author6.setLastname("Aliski");
        Book book4=new Book();
        Author[] authors5= new Author[2];
        authors5[0]= author5;
        authors5[1]= author6;
        book4.setAuthors(authors5);
        book4.setCaption("Xudijnik");
        System.out.println(book4.toString());
        
        
    }
    
}
