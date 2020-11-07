/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Magi
 */
public class Model {
    
    public static void main(String[] args) {
        ConnectDB obj = new ConnectDB();
        BookDB bk = new BookDB();
        UserDB us = new UserDB();
        obj.getConnection();
        bk.getBook("B0001");
        bk.getAllBooks();
        bk.addNewBook("B0004", "Lap trinh PHP", "Hoang Anh", "LT", "PHP");
        bk.searchByCategory("LT");
        bk.searchByKeyword("Java");
        bk.searchByAuthor("Nguyễn Thành Thủy");
        bk.searchByTitle("Lập trình Java");
        bk.deleteBookByID("B0004");
        us.addNewUser("U0003", "Lê Anh Tuấn", "a@b.c", "1234", "BT", "1");
        us.deleteUserByID("U0003");
    }
}
