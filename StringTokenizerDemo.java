import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerDemo {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer string");
		String String1=sc.nextLine();
		StringTokenizer input=new StringTokenizer(String1);
		int sum=0;
		System.out.println("The integers are:");
		while (input.hasMoreTokens()){
			int num1=Integer.parseInt(input.nextToken());
			System.out.println(num1);
			sum=sum+num1;
		}
		System.out.println("Sum is"+sum);
		}
		
	}
	


