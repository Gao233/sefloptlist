import java.util.*;
import java.lang.Math.*;

public class dataSet {
	
	double[] prob;
    int dataSize;
 
    public static node dataSet;
    
    public dataSet(double[] prob){
    	prob = this.prob; 
    	dataSet = new node(0, null);
    }
    
    public int genSample(double[] prob){
      
    	double r = Math.random();
    	
    	if( r < prob[0]){
    		return 0;
    	}else if( r >= prob[0] && r <= prob[1] ){
    		return 1;
    	}else if( r > prob[1] && r <= prob[2] ){
    		return 2;
    	}else if( r > prob[2] && r <= prob[3] ){
    		return 3;    	
    	}
    	
    	return 0;
    }
    
    public node genSet(double[] prob){
    	
    	int n = 100000;
    	for(int i = 0; i < n; i++){
    		dataSet.next= new node(genSample(prob));
    		
    	}
    	
    	printNodes();
    	
        return dataSet;	
    }
    	
    	
    	
    private static void printNodes() {
		for (node x = dataSet.next; x != null; x = x.next) {
			System.out.print(x);
		}
		System.out.println();
	}
    	
    	
    	
    }
