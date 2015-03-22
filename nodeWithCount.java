
public class nodeWithCount {
	        // reference to the next node in the chain,
	        // or null if there isn't one.
	        node next;
	        // data carried by this node.
	        // could be of any type you need.
	        int data;	
	        // set a counter for each node
	        int counter;
	 
	        // Node constructor
	        public nodeWithCount(int dataValue) {
	            next = null;
	            data = dataValue;
	            counter = 0;
	        }
	 
	        // another Node constructor if we want to
	        // specify the node to point to.
	        public nodeWithCount(int dataValue, node nextValue) {
	            next = nextValue;
	            data = dataValue;
	            counter = 0;
	        }
	 
	        // these methods should be self-explanatory
	        public int getData() {
	            return data;
	        }
	 
	        public void setData(int dataValue) {
	            data = dataValue;
	        }
	 
	        public node getNext() {
	            return next;
	        }
	 
	        public void setNext(node nextValue) {
	            next = nextValue;
	        }
	        
	    }
