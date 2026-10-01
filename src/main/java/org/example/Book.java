package org.example;

public class Book extends LibraryItem{


    public int pageCount;

    public Book(String title, String author, int year, int pageCount){
        super(title, author, year);
        this.pageCount = pageCount;
    }


    public void readBook() {
        System.out.println("Reading "+title+" by "+author);
    }
}
