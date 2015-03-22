import java.util.*;

public class node {
	        // reference to the next node in the chain,
	        // or null if there isn't one.
	        node next;
	        // data carried by this node.
	        // could be of any type you need.
	        int data;
	 
	        // Node constructor
	        public node(int dataValue) {
	            next = null;
	            data = dataValue;
	        }
	 
	        // another Node constructor if we want to
	        // specify the node to point to.
	        public node(int dataValue, node nextValue) {
	            next = nextValue;
	            data = dataValue;
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
