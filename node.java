
public class node {
	        // reference to the next node in the list
	        node next;
	        // data carried by this node.
	        int data;	      
	        
	        // Node constructor
	        public node(int dataValue, node nextValue) {
	            next = nextValue;
	            data = dataValue;
	        }
	        
	        public String toString(){
	    		return data + " ";
	    	}
	        
	    }
