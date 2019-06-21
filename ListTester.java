//Author: Reza Akhlaqi          6-21-2019
package singly_linked_list;


public class ListTester {

   
    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();  //make new object from SinglyLinkedList class
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove(); //will remove 2
        sll.remove(); //will remove 15
        sll.printValues(); //will print the result

        
        
//end
    }
    
}
