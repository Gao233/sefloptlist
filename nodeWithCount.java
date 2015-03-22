
public class nodeWithCount {
	        // reference to the next node in the chain,
	        // or null if there isn't one.
	        nodeWithCount next;
	        // data carried by this node.
	        // could be of any type you need.
	        int data;	
	        // set a counter for each node
	        int counter;
	 
	        // Node constructor
	        public nodeWithCount(int dataValue, nodeWithCount nextValue) {
	            next = nextValue;
	            data = dataValue;
	            counter = 0;
	        }
	        
	        public int getCounter(){
	        	return counter;
	        }
	        
	        public int increCounter(){
	        	return counter++;
	        }
	        // these methods should be self-explanatory
	        public int getData() {
	            return data;
	        }
	 
	        public void setData(int dataValue) {
	            data = dataValue;
	        }
	 
	        public nodeWithCount getNext() {
	            return next;
	        }
	 
	        public void setNext(nodeWithCount nextValue) {
	            next = nextValue;
	        }
	        
	        public String toString(){
	    		return data + "(" + counter +") ";
	    	}
	    }
