import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String word,reverse="";
	System.out.println("Enter a string");
	word=sc.nextLine();
	char characterArray[] = word.toCharArray();
	int length=word.length();
	for(int i=0;i<length;i++)
	{
		reverse=reverse+characterArray[length-1-i];
	}
	System.out.println("Reverse of a word  "+reverse);
	
}
}
