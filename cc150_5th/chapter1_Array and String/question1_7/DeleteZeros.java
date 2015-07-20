package question1_7;

public class DeleteZeros {

	public void deleteZeros (int [][]mtrx){
		
		int row = mtrx.length; //get the number of rows
		int col = mtrx[0].length; //get the number of columns 
		
		int i, j;
		
		//Method 1, Space O(max(M,N)), Time O(N^2)
	/*
		boolean []locRow = new boolean[row]; // default boolean[] is false, don't need initialize
		boolean []locCol = new boolean[col]; // default boolean[] is false, don't need initialize
		

		
		for (i= 0; i< row; i ++){
			for (j = 0; j < col; j ++){
				
				if (mtrx[i][j] == 0){
					locRow[i]  = true;
					locCol[j] = true;
				}
			}
		}
		
		
		for (i = 0; i <row; i++){
			for (j = 0; j <col; j++){
			
				if (locRow[i] || locCol[j]) // set matrx[i][j] =0 whether Row i or Col j as 0
					mtrx[i][j] = 0; 
			}
		}
		
		*/
		
		//Method 2: Space O(1), Time O(N^2)
	
		boolean r1 = false, c1 =false ;//!!!need initalize as false
		for (i = 0; i <row; i ++) {
			for (j = 0; j<col; j ++){
				
				if (mtrx[i][j] == 0){
				    if (i == 0)
					  r1 = true; //mark if zero locates at Row 0 
				    if (j == 0)
				    	c1 = true; //mark if zero locates at Column 0 
				    
				    mtrx[0][j] = mtrx[i][0] =0;				
				}
			}
		}
		
		for (i = 1; i < row; i ++){
			for (j =1; j <col; j ++){
				
				if (mtrx[0][j] ==0 || mtrx[i][0] ==0 )
					mtrx[i][j] = 0;
			}
		}
		
		if (c1)
			for (i = 0; i < row; i++){
				mtrx[i][0] =0;
			}
		if (r1)
			for (i = 0; i <col; i ++){
				mtrx[0][i] =0;
			}
		
		
		
	}
	
	
	public void printMatrix(int[][]mtrx){
		
		for (int i = 0; i <mtrx.length; i++){
			for (int j = 0; j <mtrx[0].length; j++){
				
				System.out.printf("%d ", mtrx[i][j]);

			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	
	public static void main (String[] args){
		
		DeleteZeros obj1 = new DeleteZeros();
		
		int [][]matrix = {{1,2,3,4,5}, {6,0,8,9,10},{0,0,13,14,15}};
		obj1.printMatrix(matrix);
		
	    obj1.deleteZeros(matrix);
		obj1.printMatrix(matrix);
		
		
		
	}
	
}
