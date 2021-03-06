package com.example.tan.kings;

public class King {
    //simple model class that will become our data source
    private String name;
    private int from, to;

    //constructor
    public King(String name, int from, int to) {
        this.name = name;
        this.from = from;
        this.to = to;
    }
    //getters
    public String getName() {
        return name;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
    //toString method that will return the value that appears for each object in the
    // listview container
    public String toString(){
        return name;
    }
    //ALT + INSERT -> gives the option to generate methods, getters, etc

}
