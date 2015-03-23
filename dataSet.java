import java.util.*;
import java.lang.Math.*;

public class dataSet {
	
	double[] prob;
    int dataSize;
    List<Integer> dataSet;
    
    public dataSet(double[] prob){
    	prob = this.prob; 	
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
    
    public List<Integer> genSet(double[] prob){
    	int n = 100000;
    	for(int i = 0; i < n; i++){
    		dataSet.add(genSample(prob));
    		System.out.print(dataSet.get(i));
    	}
    	
        return dataSet;	
    }
    	
    	
    	
    	
    	
    	
    	
    }
