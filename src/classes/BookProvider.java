
package classes;

import entity.Book;
import java.util.Scanner;


public class BookProvider {
    public Book createBook(){
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        
        //----------------- Inset Data of book--------------------
        book.setId(null);
        
        System.out.println("Введите название: ");
        book.setTitle(scanner.nextLine());
        
        System.out.println("Введите автора: ");
        book.setAuthor(scanner.nextLine());
        
        System.out.println("Введите год издания: ");
        book.setYear(new Integer(scanner.nextLine()));
        
        
        return book;
    }
}
