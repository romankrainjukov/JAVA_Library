/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HistoryProvider {

    
    public History createHistory(List<Book> listBooks, List<Reader> listReaders){
        History history = new History();
        Scanner scanner = new Scanner(System.in);
        
        //----------------- Inset Data of book--------------------
        history.setId(null);
        
       
        
        
        return history;
    }

    History createHistory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
