import java.util.Scanner;
public class Abstract {
	public static void main(String[] args)
	{
		Rectangle rectangle=new Rectangle();
		Triangle triangle=new Triangle();
		Hexagon hexagon=new Hexagon();
		   
		
		
		rectangle.numberofsides();
		triangle.numberofsides();
		hexagon.numberofsides();
		
	}
}
	abstract class shape{
		void numbersofsides() {
		
		}
		
	}
   class Rectangle extends shape{
	   void numberofsides() {
		   System.out.println("Number of sides of rectangle =4");
	   }
   }
   class Triangle extends shape{
	   void numberofsides() {
		   System.out.println("Number of sides  triangle=3");
	   }
   }
   class Hexagon extends shape{
	   void numberofsides() {
		   System.out.println("Number of sides hexagon=6");
	   }
   }
   

   

   


