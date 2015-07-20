package question1_6;

public class RotateNinty {
	
	public void RotateMatrix (int [][]mtrx, int N){
		
		int temp, i , j, k, l;
	/*	Is that correct??
		for (i = 0; i < N; i ++){
			for (j = 0; j < i; j ++){
			temp = mtrx [i][j];
			mtrx[i][j] = mtrx[j][i];
			mtrx[j][i] = temp;
			
		}
		}
			for (i = 0; i < N ; i ++){
				for (j = 0; j < N/2; j ++){
					temp = mtrx[i][j];
					mtrx[i][j] = mtrx[i][N-j-1];
					mtrx[i][N-j-1] = temp;
				}
			}
			*/
		for (i= 0; i < N/2; i ++)
		{
			for (j = i; j < N-1-i; j++)
			{
				k = N - 1 - i; 
				l = N - 1 - j;
				
				temp = mtrx[i][j];
				mtrx[i][j] = mtrx[l][i];
				mtrx[l][i] = mtrx[k][l];
				mtrx[k][l] = mtrx[j][k];
				mtrx[j][k] = temp;
				
			}
		}
	}
	
	
	public void printMatrix (int [][]mtrx, int N) {
		
		for (int i = 0; i < N ; i ++) {
			for (int j = 0; j < N; j++){
				
				System.out.printf("%d ", mtrx[i][j]);
				
			}
				System.out.println();
		}
		
		
	}

	
	
	
	
	
	
	
	public static void main (String []args){
		
		RotateNinty r1 = new RotateNinty();
		int [][]matrix = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}, {19, 20, 21, 22, 23, 24}, {25, 26, 27, 28, 29, 30},{31, 32, 33, 34, 35, 36}};
		r1.RotateMatrix(matrix, 6);
		
	    r1.printMatrix(matrix,6);
		
	}
	
	
	
}