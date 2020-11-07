package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class BookDB {
    //--------------------------------------------------------------------

    public static Book getBook(String bid) {
        Book b = null;
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Select * from Books where BookID='" + bid + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                String bookID = rs.getString(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String keyword = rs.getString(5);
                b = new Book(bookID, title, author, category, keyword);
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
                        + " | " + rs.getString(4) + " |   " + rs.getString(5));
            }
            conn.close();
            System.out.println("Get Book Successfully!!");
        } catch (Exception e) {
            System.out.println("Get Book Failure!!");
        }
        return null;
    }

    //-------------------------------------------------------------------- 
    public static ArrayList<Book> searchByBookID(String id) {
        ArrayList<Book> iBooks = new ArrayList<>();
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Select * from Books where BookID='" + id + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String bookID = rs.getString(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String keyword = rs.getString(5);
                Book b = new Book(bookID, title, author, category, keyword);
                iBooks.add(b);
            }
            conn.close();
            System.out.println("Get Books by BookID Successfully!");
        } catch (Exception e) {
            System.out.println("Get Books by BookID Failure!");
        }
        return iBooks;

    }
    //--------------------------------------------------------------------   

    public static ArrayList<Book> searchByCategory(String cat) {
        ArrayList<Book> cBooks = new ArrayList<>();
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Select * from Books where Category='" + cat + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String bookID = rs.getString(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String keyword = rs.getString(5);
                Book b = new Book(bookID, title, author, category, keyword);
                cBooks.add(b);
            }
            conn.close();
            System.out.println("Get Books by Category Successfully!");
        } catch (Exception e) {
            System.out.println("Get Books by Category Failure!");
        }
        return cBooks;
    }
    //-------------------------------------------------------------------- 

    public static ArrayList<Book> searchByKeyword(String key) {
        ArrayList<Book> kBooks = new ArrayList<>();
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Select * from Books where Keyword='" + key + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String bookID = rs.getString(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String keyword = rs.getString(5);
                Book b = new Book(bookID, title, author, category, keyword);
                kBooks.add(b);
            }
            conn.close();
            System.out.println("Get Books by Keyword Successfully!");
        } catch (Exception e) {
            System.out.println("Get Books by Keyword Failure!");
        }
        return kBooks;

    }
    //--------------------------------------------------------------------   

    public int addNewBook(String aBookID, String aTitle, String aAuthor, String aCategory, String aKeyword) {
        int rc = 0;
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "INSERT INTO Books(BookID, Title, Author, Category, Keyword) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, aBookID);
            stmt.setString(2, aTitle);
            stmt.setString(3, aAuthor);
            stmt.setString(4, aCategory);
            stmt.setString(5, aKeyword);
            rc = stmt.executeUpdate();
            conn.close();
            System.out.println("Add Books Successfully!");
            return rc;
        } catch (Exception ex) {
            System.out.println("Add Books Failure!");
            return 0;
        }

    }
    //--------------------------------------------------------------------   

    public static ArrayList<Book> searchByTitle(String aTitle) {
        ArrayList<Book> tBook = new ArrayList<>();
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Select * from Books where Title=N'" + aTitle + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String bookID = rs.getString(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String keyword = rs.getString(5);
                Book b = new Book(bookID, title, author, category, keyword);
                tBook.add(b);
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
                        + " | " + rs.getString(4) + " |   " + rs.getString(5));
            }
            conn.close();
            System.out.println("Get Books by Title Successfully!");

        } catch (Exception e) {
            System.out.println("Get Books by Title Failure!");
        }
        return tBook;
    }
    //--------------------------------------------------------------------  

    public static ArrayList<Book> getAllBooks() {
        ArrayList<Book> allBooks = new ArrayList<>();
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from Books");
            while (rs.next()) {
                String bookID = rs.getString(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String keyword = rs.getString(5);
                Book a = new Book(bookID, title, author, category, keyword);
                allBooks.add(a);
            }
            conn.close();
            System.out.println("Get All Books Succesfully!!");
        } catch (Exception e) {
            System.out.println("Get all books  Failure!!");
        }
        return allBooks;
    }

    //--------------------------------------------------------------------  
    public static ArrayList<Book> searchByAuthor(String aAuthor) {
        ArrayList<Book> aBook = new ArrayList<>();
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Select * from Books where Author=N'" + aAuthor + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String bookID = rs.getString(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String keyword = rs.getString(5);
                Book b = new Book(bookID, title, author, category, keyword);
                aBook.add(b);
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
                        + " | " + rs.getString(4) + " |   " + rs.getString(5));
            }
            conn.close();
            System.out.println("Get Books by Author Successfully!");

        } catch (Exception e) {
            System.out.println("Get Books by Author Failure!");
        }
        return aBook;
    }
//--------------------------------------------------------------------  

    public int deleteBookByID(String aBookID) {
        try {
            // connnect to database 
            Connection conn = ConnectDB.getConnection();
            // create statement
            String sql = "Delete from Books where BookID='" + aBookID + "'";
            Statement stmt = conn.createStatement();
            // execute sql
            stmt.executeUpdate(sql);
            // close connection
            conn.close();
            System.out.println("Delete Book successfully!");
            return 1;
        } catch (Exception ex) {
            System.out.println("Delete Book failure!");
            ex.printStackTrace();
            return 0;
        }
    }

    //--------------------------------------------------------------------  
    public int updateBook(String aBookID, String aTitle, String aAuthor, String aCategory, String aKeyword) {
        int rc = 0;
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Update Books set Title=?,Author=?,Category=?,Keyword=? where BookID=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, aTitle);
            stmt.setString(2, aAuthor);
            stmt.setString(3, aCategory);
            stmt.setString(4, aKeyword);
            stmt.setString(5, aBookID);
            rc = stmt.executeUpdate();
            conn.close();
            System.out.println("Update Books Successfully!");
            return rc;
        } catch (Exception ex) {
            System.out.println("Update Books Failure!");
            return 0;
        }
    }

}
