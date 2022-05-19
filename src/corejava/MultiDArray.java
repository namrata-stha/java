package corejava;

public class MultiDArray {
	
	/*
	 * ================Multi Diemsional Array=================
	 * 
	 * Syntax:
	 * 
	 *   data_type array_name[][] = new data_type [row][col];
	 */
        public static void main(String[] args) {
	
        	int mat[][] = new int [2][2];
        	 //write value in MultiDArray
        	
        	for(int i = 0; i<2; i++) {
        		
        		for(int j = 0; j<2; j++) {
        			
        			mat[i][j]= 40;
            	}
          }
        	//read data from array
        	for(int i=0; i<2; i++) {
        		
        		for(int j=0; j<2; j++) {
        			System.out.print(mat[i][j]+" ");
        		} 
        		
        		System.out.println();
        	}
        		
        		
        	
        	
        	
        	
}
}
