package com.cg.pl;

import java.util.Collection;

public class Book extends WrittenItem {
public Book() {
}
	public Book(int id1, String title, String author, int noCopies) {
		super(id1,title,author,noCopies);
	}


	@Override
	public void checkIn(int bookId) {
		Item ob=bookList.get(bookId);
		ob.setNoCopies(ob.getNoCopies()+1);
		System.out.println("Book Returned Successfully.!!");
	}

	@Override
	public void checkOut(int bookId) {
		Item ob=bookList.get(bookId);
		ob.setNoCopies(ob.getNoCopies()-1);
	}

	@Override
	public void print() {
	Collection<Item> c=bookList.values();
	for(Item o:c) {
		System.out.println(o.getBookId()+" "+o.getTitle()+" "+o.getNoCopies());
	}
	}
	@Override
	public Item addItem(int id1, String title, String author, int noCopies) {
		Item item=new Book(id1,title,author,noCopies);
		bookList.put(id1, item);
		return item;
	}

}
