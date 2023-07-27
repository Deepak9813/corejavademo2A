package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Book;

public class BookServiceImpl implements BookService {

	static List<Book> blist = new ArrayList<>();

	@Override
	public void addBook(Book b) {
//		blist.add(b);
//		System.out.println("===========successfully added======== Size = " + blist.size());

		// From database
		try {

			// register driver [load the driver]
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getConnection(url, username, password)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");

			// write sql, create statement, execute sql
			String sql = "insert into book(name, author, publicationYear, publisher, language, price) values('"
					+ b.getName() + "', '" + b.getAuthor() + "', '" + b.getPublicationYear() + "', '" + b.getPublisher()
					+ "', '" + b.getLanguage() + "', '" + b.getPrice() + "')";
			
			Statement stm = con.createStatement();
			stm.execute(sql);
			
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteBook(int index) {
		//blist.remove(index);
		
		//From Database
		
		try {
			
			//register driver [load the driver]
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//getConnection(url, username, password)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
			
			//write sql, create statement, execute query
			String sql = "delete from book where id = '"+index+"'";
			
			Statement stm = con.createStatement();
			stm.execute(sql);
			
			con.close();
			
			System.out.println("Deleted Successfully");
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateBook(Book b) {
		blist.add(b);

	}

	@Override
	public List<Book> getAllBook() {

		//From Database
		
		try {
			//register driver [load the driver]
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//getConnection(url, username, password)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
			
			//write sql, create statement, execute query
			String sql = "select * from book";
			
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("Id = "+rs.getInt("id"));
				System.out.println("Name = "+rs.getString("name"));
				System.out.println("Author = "+rs.getString("author"));
				System.out.println("Publication Year = "+rs.getInt("publicationYear"));
				System.out.println("Publisher = "+rs.getString("publisher"));
				System.out.println("Language = "+rs.getString("language"));
				System.out.println("Price = "+rs.getString("price"));
				System.out.println("============================");
			}
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return blist;
	}

}
