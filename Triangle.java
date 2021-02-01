import java.util.Scanner;

class Triangle
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base of the triangle");
		double x = s.nextInt();
		System.out.println("Enter the 2 sides of the traingle");
		double y = s.nextInt();
		double z = s.nextInt();
		System.out.println("Enter the hieght of the triangle");
		double h = s.nextInt();
		
		if(x==y && y==z && z==x)
		System.out.println("Equilateral");
		else if((x==y && y!=z) || (x!=y && z==x) || z==y&& z!=x)
		System.out.println("Isosceles");
		else
		System.out.println("Scalene");
		System.out.println("Area of the tringle =" +(x*h)/2); 
	}
}
