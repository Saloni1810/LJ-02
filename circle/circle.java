package circle;
import java.util.Scanner;

public class circle 
{
	static double PI = 3.14;
	double radius, area, cir;
	
	
	public void getRadius()
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("enter radius");
			
			double radius = sc.nextDouble(); 
			
			double area = PI * radius * radius;
			System.out.println("Area of circle is: " + area);
		}
		
	}
	public static void main(String args[])
	{
		circle c1 = new circle();
		c1.getRadius();
	}

}
