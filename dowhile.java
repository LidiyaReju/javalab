import java.util.Scanner;


public class dowhile {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
		int sum=0;
		System.out.println("Enter a number");
		int n=sc.nextInt();
		do {
			sum=sum+n;
			System.out.println("Enter next number");
			n=sc.nextInt();
		
		}while (n>0);
			
		
		
		System.out.println("Sum"+sum);
		}
	}






