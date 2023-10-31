/*file			:	Matrix Multiplication.java
 * Author		:	Lidiya Reju
 * version		:	1.0
 * description	:	to multiply a matrix
 * date			:	10/10/23 */
 import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter row and column of matrix 1");
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		System.out.println("Enter row and column of matrix 2");
		int row2=sc.nextInt();
		int col2=sc.nextInt();
		 if(col1!=row2)
		 {
			 System.out.println("Multiplication not possible");
		 }
		 else
		 {
			 int[][]matrix1=new int[row1][col1];
			 int[][]matrix2=new int[row2][col2];
			 int[][]result=new int[row1][col2];
			 int i,j,k;
			 System.out.println("Enter values of matrix1");
			 for(i=0;i<row1;i++) {
				 for(j=0;j<col1;j++) {
					 matrix1[i][j]=sc.nextInt();
					 
				 }
			 }
			 System.out.println("Matrix1");
			 for(i=0;i<row1;i++) {
				 for(j=0;j<col1;j++) {
			 System.out.print(matrix1[i][j]+"\t");
			 
				 }
				 System.out.println();
			 }
			 System.out.println("Enter values of matrix2");
			 for(i=0;i<row2;i++) {
				 for(j=0;j<col2;j++) {
					 matrix2[i][j]=sc.nextInt();
					 
				 }
			 }
			 System.out.println("Matrix2");
			 for(i=0;i<row2;i++) {
				 for(j=0;j<col2;j++) {
					 System.out.print(matrix2[i][j]+"\t");
				 }
				 System.out.println();
				 }
			 
			 for(i=0;i<row1;i++) {
				 for(j=0;j<col2;j++) {
					 result[i][j]=0;
					 for(k=0;k<col1;k++) {
						 result[i][j]=result[i][j]+matrix1[i][k]*matrix2[k][j];
					 }
				 }
		 }
			 System.out.println("Result:");
			 for(i=0;i<row2;i++) {
				 for(j=0;j<col2;j++) {
					 
					 System.out.print(result[i][j]+"\t");
				 }
				 System.out.println();
			 }
			 
		 }
		
	}

}
