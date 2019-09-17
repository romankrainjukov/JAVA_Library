/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class HistoryProvider {
History history = new History();
Scanner scanner = new Scanner(System.in);
    
    public History createHistory(List<Book> listBooks, List<Reader> listReaders){

        System.out.println("Выдать книгу");
        System.out.println("Список книг в библиотеке: ");
        for(int i=0;i<listBooks.size();i++){
            System.out.printf("%d. Название: %s. Автор: ",
                    i+1,listBooks.get(i).getTitle(),
                    listBooks.get(i).getAuthor());
        }
        
        System.out.println("Список читателей библиотеки: ");
        for(int i=0;i<listReaders.size();i++){
            System.out.printf("%d. %s. %s%n",
                    i+1,listReaders.get(i).getName(),
                    listReaders.get(i).getLastname());
        }
        
        System.out.println("Выберите номер книги: ");
        int numBook = scanner.nextInt();
        System.out.println("Выберите номер читателя: ");
        int numReader = scanner.nextInt();
        history.setBook(listBooks.get(numBook -1));
        history.setReader(listReaders.get(numReader - 1));
        history.setTakeOnDate(new Date());
        
        //----------------- Inset Data of book--------------------
        history.setId(null);
        
        
        
        
        return history;
    }
    public void returnBook(List<History> histories){
        System.out.println("");
        System.out.println("");
        for(int i=0; i<histories.size(); i++){
            System.out.printf("%d. %s. %s%n",
            i+1,
            histories.get(i).getBook().getTitle(),
            histories.get(i).getReader().getName(),
            histories.get(i).getReader().getLastname()
            );
        }
        System.out.print("");
        int numHistory = scanner.nextInt();
        histories.get(numHistory - 1).setReturnDate(new Date());
    }
    
}
