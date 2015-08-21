package linkedlist;
//Runtime
//Test Case #0:   0.08s Test Case #1:   0.09s
public class InsertHead {
	Node Insert(Node head,int x) {
	    Node newNode = new Node();
	    newNode.data=x;
	    Node current = head;
	    if(current == null){
	        newNode.next = null;
	        current = newNode;
	    }
	    else{
	        newNode.next = current;
	        current = newNode;
	    }
	    return current;    
	}

}
