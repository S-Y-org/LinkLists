package com.Lab03;

public class MainApp {
    public static void main(String[] args) {
        Link Nipuna = new Link("Nipuna",53.5);
        Link Aravinda = new Link("Aravinda",78.0);
        Link Prashani = new Link("Prashani",69.5);

        //a>(iii)
        Nipuna.next = Aravinda;
        Aravinda.next = Prashani;
        Prashani.next = null;
        /*We write like this also*/
        /*Nipuna.next.next = Prashani;*/

        //Lets call the displayDetails()
        Nipuna.displayDetails();
        Aravinda.displayDetails();
        Prashani.displayDetails();

        /*Here we just connected the Links that's it, its just a connection
        *
        * It is not a Link list yet*/
        ////////////////////////////////////////////////////////////////////////////////////////




        //b>(ii)

        LinkList list = new LinkList(); //create a new list

        list.insertFirst("Prashani",69.5);
        list.insertFirst("Aravinda",78.0);
        list.insertFirst("Nipuna",53.5);

        /*Prashani is the firslty added one/link, then only in the output you will get one given in the question*/


        System.out.println("\nb>(ii)");
        list.displayList();//display the list

        list.deleteLink("Aravinda"); //lets delete aravinda and see

        System.out.println();
        System.out.println("---------------deleted---------------");
        System.out.println();

        list.displayList();



    }
}//end of MainApp
