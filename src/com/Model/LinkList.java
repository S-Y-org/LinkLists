package com.Model;

public class LinkList {
    /*Apart from the iData and next attributes , what should the LinkList class maintain ?
    * We identify the start of a Link list using thr first attribute*/

    /*This attribute, we cant have in the Link Class
    * Becuz in order to have it as the first, we want to have a list
    * That Link class is just one link
    * Inside one link there is no first
    * But when u have a collection of links, we have to identify the starting point*/

    /*first is another link/rectangle
    * So the data type is Link*/
    private Link first;

    public LinkList() { //constructor, dont need to pass any parameter cuz all the needed things have been assinged in the Link class

        first = null; //null becuz , initially the link list is empty
    }

    public boolean isEmpty(){

        return (first == null);
    }

    //IMPORTANT//

    /*Remember that Find,Insert and Delete has to implemented inside the LinkList class*/

    /*Becuz in just one link/rectangle u cant do the Find,Insert and Delete*/

    /*If we have a list only we can do these*/



    /*Before the methods lets have a display method for the TOTAL LIST */

    /*displayLink() and displayList() is NOT THE SAME*/

    /*displayLink() is there to print ONLY ONE VALUE*/

    /*displayList() is there to print the ENTIRE LIST WITH ALL THE VALUES*/

    ////////////////////////////////////////////////////////////////////////////////////////////////

    /*To build the logic for the displayList() lets consider the following example*/

    /*

    first--->[ 5 ]--->[ 10 ]--->[ 15 ]--->null


    Now we have to disply 5,10 and 15

    1)We anyway have to start with the first

    2)Lets create a Link Object call current.

    Link current = first;


    //current is a link, it is pointing to 5
    //5 is the iData value
   //current.iData = 5
   //Dont think that current = 5
   //Here actually without using current.iData , we can use the method we've defined ; displayLink()

   //Until the current is going to null, using the next prop we are going to iterate


     */


    public void displayList(){
        Link current = first; //Starting from first

        while (current != null){ //current = null means end, so current != null means ur in the middle of the list
            current.displayLink(); // go to each link and print , we print 5 first

            /*Now we want to move the current to the next position*/
            current = current.next;

            /*current++ wage gon scene danna epa. current is not a vairable. Its a Link*/
        }
        System.out.println("");
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////

    /*NOW LETS IMPLEMENT THE  Find()*/

    /*To build the logic for the  Find() lets consider the following example*/

    /*

    first--->[ 5 ]--->[ 10 ]--->[ 15 ]--->[ 20 ]--->null

    Lets say we want to find 15

    **So 15 is the key value

    1)Wht ever we do , we have to start from first and then nagivate to 15

    2)current = current.next ; is how we move from link to link

     */

    public boolean find(int key){
        Link current = first;

        while (current != null){
            /*Now in each iteration we have to check whether the links value is = to the key*/
            if (current.iData == key)
                return true; //if the key is found just return true
            else
                current = current.next;
                //if i dont find it , i must move to the next link

        }
        return false;
        /*Logic for putting the return false outside the while-loop*/

        /*Let say the key value is 100
        * Now as we can see we dont have a 100 in the list
        * That means until the end of the list we cant find 100
        * UNTIL THE END OF THE LIST means OUTSIDE THE WHILE LOOP
        * We werent able to find it inside the list, that means we have to return false outside the while loop*/
        //YOU ARE GOING OUTSIDE THE WHILR-LOOP MEANS U HAVEN'T FOUND IT
    }


    //IF THE RETURN TYPE OF FIND IS LINK , LETS SEE WHT MODIFICATIONS TO DO//
    /*That means if u found it, u must return that link*/

/*
    public Link find(int key){
        Link current = first;

        while (current != null){
            *//*Now in each iteration we have to check whether the links value is = to the key*//*
            if (current.iData == key)
                return current; //if the key is found, return the current link
            else
                current = current.next;
            //if i dont find it , i must move to the next link

        }
        return null; //if u cant find it, wht u have to return is null
    }*/



    ///////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////

    /*NOW LETS INSERT() A NEW LINK TO THE CURRENT LINK*/

    /*NOW LETS IMPLEMENT THE  insert()*/

    /*To build the logic for the  insert() lets consider the following example*/

    /*

    first--->[ 5 ]--->[ 10 ]--->[ 15 ]--->[ 20 ]--->null

    I want to insert 2 to the beginning of the list

    Now the first is pointing to where u have 5

    So we have to return that and make the first point to 2

    So we can have a method name call insertFirst

    doesnt return anything, we are just inserting

    So we have to mention wht we are inserting as a parameter

     */

    public void insertFirst(int key){

        /*1)Simply we cant just insert a value (2) , we can insert only a link/rectangle with the value in it
        * So the very first thing we should do is , with this key value we have to create a link, a new link*/
        Link newLink = new Link(key);

        //Now the link is created with value 2 , and its name is newLink

        /*2)Now we want to make the newLink as first*
        That means the first needs to point to 2 and after 2 u have to have 5
        That means 2 arrows/references u have to create
         Then u will have the list like below ;

         first--->[ 2 ]--->[ 5 ]--->[ 10 ]--->[ 15 ]--->[ 20 ]--->null
         */

        //IMPORTANT//

        /*U might think we first create the first pointing to 2 reference. NO
        * We first create the 2 pointing to 5 reference. WHY ?

        It is becuz , if we create the first pointing to 2 first, do we have anything to recongnize 5
        So we cant identify the 5 , becuz nothing is pointing towards it
        *
        * Therefore we create the 2 pointing to 5 first */

        //So the logic for the code is ; newLinks next is equal to the link where u have 5
        newLink.next = first; //link where we have 5 is first

        //Now 1st reference is created

        //Now lets build the 2nd reference, first pointing to 2 , 2 means the newLink
        first = newLink;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////

    /*NOW LETS SEE HOW WE CAN INSERT IN THE MIDDLE OF THE LIST*/

     /*

    first--->[ 5 ]--->[ 10 ]--->[ 15 ]--->[ 20 ]--->null

    Lets say we want to insert 12 between 10 and 15

    Now the data type of the insertAfter() depends on the question

    Here we go with boolean

    And we pass 2 parameters ; int key and int newData

    key is 10 according to our example.

    WHY ? Becuz we insert 12 in-between 10 and 15

    That means after 10 only we put 12

    newData is 12.

     */

    public boolean insertAfter(int key, int newData){

        /*1)Now remember if its an insertion always create a link first without just inserting the value
        * Becuz we cant insert a value, we can only insert a link*/

        Link newLink = new Link(newData);

        /*2)Now my target is to find 10 first, becuz after 10 we insert the 12
        * We can find 10 using the find  method
        * Here we cant just code .find()
        * We have to implement it*/

        //Let implement the find() , refer above codes
        Link current = first;

        while (current != null){
            if(current.iData == key){
                /*The question say after finding 10 immediatley insert 12 */
                /*So now this is like the normal insertFirst() method
                * There are 2 references to be created
                * i)10 pointing to 12
                * ii)12 pointing to 15
                * So we know first we have to create the (ii) reference , then (i)*/

                /*ii)12 pointing to 15 ; LETS SEE THE CODING*/
                /*Remember the current(temporary link) as well*/
                /*So 15 means current.next
                * 15 is current.next becuz the current is currently at 10, we placed it at 10
                * So after 10 we have 15 neh ithin.....*/

                newLink.next = current.next; //1st reference DONE !

                /*i)10 pointing to 12 ; LETS SEE THE CODING*/
                /*10 means current link*/
                current.next = newLink; //2nd reference DONE !

                return true; //finally we have the return statement

            }
            else{
                /*In each iteration if u dont find 10, then u have to move to the next link*/

                current = current.next; //moving to the next link
            }
        }
        /*When u can't find 10 , that means we cannot insert 12*/
        return false;
    }




    ///////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////


    /*LETS SEE THE DELETE()*/

    /*Let first see the deleteFirst()*/

    //The data type depends on the question

    //Here we take it as Link , so that means once we delete it, we have to return that link


    /*NOW LETS SEE HOW WE CAN DELETE 5*/

     /*

    first--->[ 5 ]--->[ 10 ]--->[ 15 ]--->[ 20 ]--->null

    We delete 5 and we make first as 10

     */

    public Link deleteFirst(){

        /*Since we have to return the deleted first link , lets create variable(actually we create a temp object) and assign it*/
        Link temp = first;

        /*Now how the delete happens is , the first should point to 10 , then 5 will be cancelled out*
        So i want to say that my first is equal to 10
         */
        first = first.next;

        //10 means ; currently first is 5, and 5's next is 10. 5 means first, so first.next is 10

        return temp; //once deleted we have to return it

        /*If the question doesnt ask to return we dont need the code in lines 325[Link temp = first;] and 334[return temp;]*/
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////


    /*Tute 20 > Question 2> ii*/

    /*ASKING TO WRITE THE CODE FOR DELETE()
    * But does not say first or middle
    * Therefore we have to create a code to tackle both situations*/

    /*Data type of delete given as boolean*/

    //Lets think key is 15

         /*

    first--->[ 5 ]--->[ 10 ]--->[ 15 ]--->[ 20 ]--->null

   1)In order to delete 15, we have to find it first
     *Its the same as find()

     */


    public boolean delete(int key){
        Link current = first;
        Link previous = first; //Explanation below.

        while (current != null){
            if(current.iData == key){ //This means we have found 15, that means we have to delete it
                /*So wht do we  mean by deleting ?
                * We just change the reference/arrow*/

                /*15 is in-between 10 and 20
                *That means after 10 , reference should go to 20*/

                /*Now we need a general way to identify the 10
                *
                * Becuz here we know 10 is after 5, that means after first
                *
                * But always thats not the case, there might be 1000 links sometimes*/

                /*So we CREATE ANOTHER LINK OBJECT CALLED previous*/

                /*When current is to wht ever the link , previous is coming one behind that
                *
                * It means if current is at 15 , then previous is at 10
                *
                * It means if current is at 20 , then previous is at 15 */

                /*We have to create this object at the beginning (CHECK ABOVE)*/

                /*Link previous = first;

                * Now u might think if current and previous both are starting at the same point, how that 1 link gap is created

                For now just think there is a 1 gap difference. Explanation will be done*/

                //Now we can write 10th next is 20 like below
                previous.next = current.next;
                //previous means 10
                //so previous.next should = to 20
                //20 means current.next

                return true;
            }
            else{ //if i didn't find 15, i have to move the current to the next position WHILE MAINTAINING THE previous WITH 1 GAP DIFFERENCE
                /*So while moving the current , the previous has to have to a 1 gap difference*/

                /*How we write this is , we have to move the previous into the place of the current*/
                previous = current;

                //Then only current moves to the next position
                current = current.next;

                /*One the 1 gap difference is build*/
            }
        }
        return false; //even after the while-loop we cant find means, we cant delete. So we have to return false

        /*Now we have done the coding for deleting 15
        *
        * That means delete in middle
        *
        * But this question is a general scenario
        *
        * So the key can be 5 as well. That means delete first
        *
        * So how are we going to implement this in the same code*/


        /*For this we have to go back to code-line 369 ; if(current.iData == key)
        *
        * That means after finding the key, we have to check whether it is the first*/

        /*I will do the alteration here ,since it will be clear without all the comments in the middle*/



        /*   Line 368 :           while (current != null){
                                    if(current.iData == key){
                                        if(current == first){ //IF FIRST IS DELETING
                                            first = first.next; //Here we dont need the temp and return since here its boolean
                                            return true; //this return indicates that we have deleted the FIRST
                                        }
                                        else{ //IF MIDDLE LINK IS DELETING
                                            previous.next = current.next;
                                            return true;
                                        }
                                    }
                                    else{
                                        previous = current;
                                        current = current.next;
                                    }
                                }*/

        /*This the the entire code for the delete(int key)*/

        /*Draw a diagram and try to understand the logic cleary*/

    }//END OF delete(int key)

}//end of LinkList Class


                                    //IMPORTANT POINTS AND QUESTIONS//

    /*

    first--->[ 5 ]--->[ 10 ]--->[ 5 ]--->[ 15 ]--->[ 20 ]--->null

    (Q)When deleting; wht if we have 5 in two places ?

        if(current == first){ //IF FIRST IS DELETING
             first = first.next; //Here we dont need the temp and return since here its boolean
             return true; //this return indicates that we have deleted the FIRST
       }

       *If we are deleting the first, the first 5 will be deleted and after the retrun true statement we know that any
       other lines of codes is not executed, the method is over

       //////////////////////////////////////////////////////////////////////////////////////////////////////////////

       BUT , THERE CAN BE ADVANCED CODE TO DELETE A SELECTED 5 ALSO

       GOOGLE IT AND FIND, EXAM MIGHT ASK QUESTIONS LIKE THAT ALSO
     */


/*ChatGPT answer
*
* To handle the scenario where there are multiple occurrences of the value you want
* to delete in a linked list, you can modify the existing code as follows:
*
*   public boolean delete(int key) {
    Link current = first;
    Link previous = null;

    while (current != null) {
        if (current.idata == key) {
            if (current == first) {
                first = first.next; //deleting means removing the reference
            } else {
                previous.next = current.next;
            }
            return true;
        }

        previous = current;
        current = current.next;
    }

    return false; // Value not found
}

 */

/*In this updated code, we iterate through the linked list and check if the current links
data matches the value we want to delete. If a match is found, we handle the deletion based on
 whether it is the first link or not. If it is the first link, we update the first reference.
 Otherwise, we update the next reference of the previous node to bypass the current node.

This implementation will delete the first occurrence of the value it encounters while
traversing the linked list.*/

