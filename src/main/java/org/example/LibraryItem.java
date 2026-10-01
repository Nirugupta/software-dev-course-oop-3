package org.example;

public class LibraryItem {

    public String title;
    public String author;
    public int year;
    public LibraryItem(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String toString(){
        return this.title +" written by "+this.author+ " in "+this.year;
    }
}
