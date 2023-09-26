import java.util.Scanner;

public class AttendancePercentage{

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Attendence Percentage");
		int attendance=sc.nextInt();
		float marks;
		
		if(attendance>90){
			marks = 10.0f;
			System.out.println(marks);
		}
		else{
			marks=(float)attendance/10;
			System.out.println(marks);
		}
	}

}


