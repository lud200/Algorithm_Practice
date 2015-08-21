package linkedlist;
//Runtime
//Test Case #0:   0.08s Test Case #1:   0.09s
public class deleteNode {
	Node Delete(Node head, int position) {
		  // Complete this method
		  int size = 0;
		    Node current = head;
		    Node temp = head;
		    Node temp1 = head;
		    Node previous = null;
		    if(current != null){
		        while(current != null){
		            previous = temp1;
		            temp1 = current;
		            current = current.next;
		            size++;
		        }
		              
		        if(position == size-1){
		            temp1 = null;
		            previous.next = null;
		        }  
		        if(position == 0){
		            if(size == 1){
		                head = null;
		            }
		            else{
		              temp = temp.next;
		              head = temp;
		            }
		        } 
		        else if(position < size-1){
		            int i = 0;
		            Node prev = null;
		            temp = head;
		            while(i<position && temp != null){
		                prev = temp;
		                temp = temp.next;
		                i++;
		            }
		            prev.next = temp.next;
		            temp = null;
		        }        
		    }
		    current = head;
		    return current;
		}


}
class Node {
    int data;
    Node next;
 }