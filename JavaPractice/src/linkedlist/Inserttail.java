package linkedlist;
//Runtime
//Test Case #0:   0.08s Test Case #1:   0.08s
public class Inserttail {
	Node Insert(Node head,int data) {
		// This is a "method-only" submission. 
		// You only need to complete this method. 
		  Node current = head;
		    Node previous = head;
		    Node newNode = new Node();
		    newNode.data = data;
		    newNode.next = null;
		    if(previous == null){
		        previous = newNode;
		    }
		    else{
		        while(current != null){
		            previous = current;
		            current = current.next;
		        }
		        previous.next = newNode;
		    }
		   return head;
		}
}
