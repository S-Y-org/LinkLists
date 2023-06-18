package com.Model;

/*Basically this class talks about a Single/Individual Rectangle/Link*/

public class   Link {
    /*Link means one rectangle
    * That rectangle has 2 properties
    * i)Data and ii)next*/

    public int iData; //data item
    public Link next; //reference to the next link, that means it has the Address of another/next link.
    //There the data type should be of class type
    /*We set both props. as public beucz there are 2 classes we are implementing
    * The 2nd class is a link list class
    * In the link list class we want to say that this is a collection of individual links together
    * So this 2nd class should be able to access the 1st class(LINK class)
    * If we make it as private , we cant access it*/

    public Link(int id) {//Constructor, we pass a parameter to assign the iData value
        iData = id;
        next = null; //initially we have only 1 rectangle, it means that it is not containing any other link
        //no connection/reference for another Link/rectangle
    }


    /*If we want to print the data value of a link we can have a display method  for that*/

    public void displayLink(){ //display data item
        System.out.println(iData);
    }

}//end of Link class
