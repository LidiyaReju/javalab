import java.util.Scanner;
public class Tryandcatch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch='y';
		while(ch=='y') {
			System.out.println("Enter number 1");
			int number1=sc.nextInt();
			System.out.println("Enter number 2");
			int number2=sc.nextInt();
		
		
			try {
				int result=number1/number2;
				}
			catch(Exception e) {
				
					System.out.println("/ by zero");
				}
			finally{
				System.out.println("End of Operation");
				System.out.println("Do you want to continue !!");
				 ch=sc.next().charAt(0);
			}
		
			}
			
		}
	}







