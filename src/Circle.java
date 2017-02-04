import java.util.Scanner;
public class Circle {
	

	public static void main(String[] args) {
		System.out.print("Please enter the radius of your circle?: ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		 final double PI = 3.14;
			double area = Math.pow(radius, 2) * PI;
			double perimeter = 2 * PI * radius;
					System.out.println("The area of the circle is: " + area);	
					System.out.println("The perimeter of the circle is: " + perimeter);	
				input.close();
				
		
		
		
	}	
}
