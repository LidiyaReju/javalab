import java.util.Scanner;
class employeedetail{
	int age;
	String phonenumber;
	String name;
	float salary;
	String address;
	Scanner sc=new Scanner(System.in);
	
void getdetails() {
	System.out.println("Enter your name");
	name=sc.next();
	System.out.println("Enter your age");
	age=sc.nextInt();
	System.out.println("Enter your phone number");
	phonenumber=sc.next();
	System.out.println("Enter your Salary");
	salary=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter address");
	address=sc.nextLine();
	}
void printdetails() {
	System.out.println("The name is :"+name);
	System.out.println("The age is :"+age);
	System.out.println("The phone number is :"+phonenumber);
	System.out.println("Address is: "+address);
	System.out.println("Salary is: "+salary);
	
	
}
}



class Officer extends employeedetail{
	String specialization;
	public void specialization()
	{
		System.out.println("Enter Specialization");
		specialization=sc.nextLine();
		
}
	public void printspecialization() {
		System.out.println("Specialization"+specialization);
	}
	
}
class Manager extends employeedetail
{
	
	String department;
	public void department()
	{
	System.out.println("Enter Department:");
	department=sc.next();
	}
	public void printdepartment()
	{
	System.out.println("Department:"+department);
	}
	}
public class Employee{
	public static void main(String[] args)
	{

	Officer officer=new Officer();
	officer.getdetails();
	officer.specialization();
	System.out.println("Details of Officer:");
	officer.printdetails();
	officer.printspecialization();

	Manager manager=new Manager();
	manager.getdetails();
	manager.department();
	System.out.println("Details of Manager:");
	manager.printdetails();
	manager.printdepartment();
	}

	}



	

	  

