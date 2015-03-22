import java.util.*;

public class node {
	        // reference to the next node in the chain,
	        // or null if there isn't one.
	        node next;
	        // data carried by this node.
	        // could be of any type you need.
	        Object data;
	 
	        // Node constructor
	        public node(Object dataValue) {
	            next = null;
	            data = dataValue;
	        }
	 
	        // another Node constructor if we want to
	        // specify the node to point to.
	        public node(Object dataValue, node nextValue) {
	            next = nextValue;
	            data = dataValue;
	        }
	 
	        // these methods should be self-explanatory
	        public Object getData() {
	            return data;
	        }
	 
	        public void setData(Object dataValue) {
	            data = dataValue;
	        }
	 
	        public node getNext() {
	            return next;
	        }
	 
	        public void setNext(node nextValue) {
	            next = nextValue;
	        }
	    }
