package com.Lab03;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void displayList(){
        Link current = first;

        while (current != null){
            current.displayDetails();
            current = current.next;
        }
        System.out.println("");
    }

    public void insertFirst(String name,double avg){
        Link newLink = new Link(name,avg); //creating a new link

        newLink.next = first; //new link links to the existing link
        first = newLink; //assign new link as first
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next; //change first reference to the next available link

        return temp;
    }

    public Link deleteLink(String name) {
        Link current = first;
        Link previous = first;

        /*Initially im checking whether there are links or not within  my link list*/
        if (current == null) {
            return null; //if list is empty
        }

        while (!current.name.equals(name)) { //while current.name IS NOT EQUAL to name(String name we passed in deleteLink())
            previous = current;
            current = current.next;

            /*Outside the while-loop also we used the same condition
            *
            * Their we checked whether there are links or not within  my link list.
            *
            * Now here what we are checking is ;
            *
            * Since we are traversing(moving/visiting) within my link list and deleting links,
            *we need to check if there are no more elements to be deleted*/
            if (current == null) {
                return null; //if there are no more elements to be deleted
            }
        }//end of while-loop
        if (current == first){
            first = first.next;
        }
        else
            previous.next = current.next;

        return current; //Returning current means ; it can either be the first link or any other link
    }//end of deleteLink

}//end of LinkList
