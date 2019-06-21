//Here we have 3 methods, for add, remove, and print values

package singly_linked_list;

public class SinglyLinkedList {
    public Node head;   //??
    public SinglyLinkedList() {
        
        
        // Create a constructor method that sets the head to null of your SinglyLinkedList objects
        this.head= null;
    }
    
    
    
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    

    
    //Create a remove() method that will remove a node from the end of your list
    public void remove (){
     if (head != null) {
          if (head.next == null) {
            head = null;
          } else {
            Node runner = head;
            while(runner.next != null) {
              if (runner.next.next == null) {
                runner.next = null;
              } else {
                runner = runner.next;
              }
            }

          }
        }   
        
    }
    
    
    //Create printValues() method that will print all the values of each node in the list in order
    public void printValues (){
        if (head == null) {
        System.out.println("List is empty");
      } else {
        Node runner = head;
        while(runner != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }
      }
    }
        
    
    
    
    //end
}
