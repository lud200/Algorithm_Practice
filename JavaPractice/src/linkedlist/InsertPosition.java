package linkedlist;
//Runtime
//Test Case #0:   0.08s Test Case #1:   0.07s
public class InsertPosition {
	Node InsertNth(Node head, int data, int position) {
	    Node newNode = new Node();
	    newNode.data = data;
	    Node current = head;
	    Node previous = head;
	    if(current == null && position>0){
	        newNode.next = null;
	        current = newNode;
	    }else if(position == 0){
	        newNode.next = head;
	        current = newNode;
	    }else{
	        int i = 0;
	        while(current != null && i<position){
	            previous = current;
	            current = current.next;
	            i++;
	        }
	        previous.next = newNode;
	        newNode.next = current;
	        current = head;
	    }  
	    return current;
	}
}
