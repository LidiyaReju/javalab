
/*file			:	FrequencyOfCharacter.java
 * Author		:	Lidiya Reju
 * version		:	1.0
 * description	:	to find the frequency of given character in string
 * date			:	03/10/23 */
 import java.util.Scanner;
public class Frequency {
	public static void main(String []args) {
	
	Scanner sc=new Scanner(System.in);
	String word;
	char Character;
	int count;
	System.out.println("Enter a word");
	word=sc.nextLine();
	System.out.println("Enter a character to be searched");
	Character=sc.next().charAt(0);
	count=frequency(word,Character);
	System.out.println("the frequency of entered character="+count );


 
}
	
	
static int frequency(String word,char Character){
	int count=0;
	char characterArray[]=word.toCharArray();
	for(int i=0;i<word.length();i++)
	{
		if(Character == characterArray[i])
		{
			count++;
		}
	}
	return count;

}
}


