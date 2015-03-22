
public class nodeWithCount {
	        // reference to the next node in the list
	        nodeWithCount next;
	        // data carried by this node
	        int data;	
	        // set a counter for each node
	        int counter;
	 
	        // Node constructor
	        public nodeWithCount(int dataValue, nodeWithCount nextValue) {
	            next = nextValue;
	            data = dataValue;
	            counter = 0;
	        }
	        
	        public String toString(){
	    		return data + "(" + counter +") ";
	    	}
	    }
