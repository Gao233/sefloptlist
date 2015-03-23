import java.util.*;

public class dataSet {
	int[] prob;
    int dataSize;
    List<Integer> dataSet;
    
    public dataSet(int[] prob){
    	prob = this.prob; 	
    }
    
    public int genSample(int[] prob){
      
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
    
    public List<Integer> genSet(int[] prob, int n){
    	
    	for(int i = 0; i < n; i++){
    		dataSet.add(genSample(prob));
    	}
        return dataSet;	
    }
    	
    	
    	
    	
    	
    	
    	
    }
