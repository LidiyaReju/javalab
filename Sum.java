/*Author:Lidiya Reju
 * version:1.0
 * data:sum of two integer data
 */
import java.util.Scanner;
public class Sum {
	public  static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a,b,sum=0;
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		System.out.println("The Sum "
				+ "is "+sum);
	}

}
