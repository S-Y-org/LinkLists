package com.Lab03;

public class Link {
    public String name;
    public double average;
    public Link next;

    //parameterized constructor
    public Link(String name, double average) {
        this.name = name;
        this.average = average;
        next = null;
    }

    public void displayDetails(){

        System.out.println("Name : "+name + "\nAverage : "+average+"\n");
    }

}//end of Link Class
