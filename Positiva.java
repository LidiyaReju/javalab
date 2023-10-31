import java.util.Scanner;
public class Positiva {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	{
		int sum=0;
		System.out.println("Enter a number");
		int n=sc.nextInt();
		while (n>0) {
			sum=sum+n;
			System.out.println("Enter next number");
			n=sc.nextInt();
			
		
		}
		System.out.println("Sum"+sum);
		}
	}

}
