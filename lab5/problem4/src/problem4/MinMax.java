package problem4;

public class MinMax{
    static class Pair{
    	int max;
		int min;
		Pair(int min, int max){
    		this.min = min;
    		this.max = max;
    	}

    }
    
	static Pair minmax(int values[]) {
		int min = 0, max = 0;
		if (values.length == 1) {
			return new Pair(0,0);
		}
		 for(int i=0; i<values.length; i++ ) {
	         if(values[i]>max) {
	            max = values[i];
	         }
	         else if(values[i]<min) {
	            min = values[i];
	          } 
		 }
	      return new Pair(min,max);
	}
}
