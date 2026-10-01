package org.example;

public class Movie extends LibraryItem{
    public int durationInMinutes;
    public Movie(String title,String author, int year, int durationInMinutes){
        super(title, author, year);
        this.durationInMinutes = durationInMinutes;
    }


}
