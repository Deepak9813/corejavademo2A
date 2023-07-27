package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Book;
import com.service.BookService;
import com.service.BookServiceImpl;

public class TestBook {

	public static void main(String[] args) {

		add();
//		getAll();
   // delete();
	}

	// add Book
	static void add() {

		BookService bs = new BookServiceImpl();

		Scanner sc = new Scanner(System.in);

		char flag = 'y';

		do {

			Book b = new Book();

			System.out.println("Enter Book Name");
			b.setName(sc.next());

			System.out.println("Enter Author");
			b.setAuthor(sc.next());

			System.out.println("Enter Publicaton year");
			b.setPublicationYear(sc.nextInt());

			System.out.println("Enter Publisher");
			b.setPublisher(sc.next());

			System.out.println("Enter Language");
			b.setLanguage(sc.next());

			System.out.println("Enter Price");
			b.setPrice(sc.nextDouble());

			bs.addBook(b);

			System.out.println("Do you want to add more[y/n]?");
			flag = sc.next().charAt(0);

		} while (flag == 'y');

	}

	// get all Product [fetchAll products]
	static void getAll() {

		BookService bs = new BookServiceImpl();

		List<Book> blist = bs.getAllBook();
		System.out.println(blist);

	}

	// delete Product
	static void delete() {

		BookService bs = new BookServiceImpl();

		Scanner sc = new Scanner(System.in);

		char flag = 'y';

		System.out.println("Do you want to delete product[y/n]?");
		flag = sc.next().charAt(0);

		if (flag == 'y') {
			System.out.println("Which Book[index] do you want to remove/delete?");

			// bs.deleteBook(sc.nextInt()); //in single line[one line]

			int index = sc.nextInt(); // in two lines
			bs.deleteBook(index);

			// get books after delete
			getAll();
		}
	}
}
