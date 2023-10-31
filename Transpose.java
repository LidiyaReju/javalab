import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		int i,j,row,col;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the row and coloumn of matrix");
		row=sc.nextInt();
		col=sc.nextInt();
		int [][]matrix=new int[row][col];
		int [][]transpose=new int[col][row];
		System.out.println("enter the value of array");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		 System.out.println("Matrix");
		 for(i=0;i<row;i++) {
			 for(j=0;j<col;j++) {
		 System.out.print(matrix[i][j]+"\t");
		 
			 }
			 System.out.println();
		 }
		
			System.out.println("The Transpose matrix:");
			for(i=0;i<row;i++) {
				for(j=0;j<col;j++) {
					transpose[i][j]=matrix[j][i];
					System.out.print(transpose[i][j]+"  ");
				}
				System.out.println();	
			}	
		}
		
	}
