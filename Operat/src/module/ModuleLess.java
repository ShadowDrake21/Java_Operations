package module;

import java.util.Scanner;

public class ModuleLess {

	public static void main(String[] args) {
		double theSmallest;
		double a, b, c;
		System.out.print("Enter tree real numbers with spaces: ");
		Scanner scan = new Scanner(System.in);
		
		a = Math.abs(scan.nextDouble());
		b = Math.abs(scan.nextDouble());
		c = Math.abs(scan.nextDouble());
		
		theSmallest = module(a, b, c);
		System.out.println(theSmallest > 0 ? "The smallest inputted number is " + theSmallest : "There are two or more equal numbers");
	}
	
	public static double module(double a, double b, double c) {
		double theSmallest = 0;
		if(a < b && a < c) {
			theSmallest = a;
		}
		else if(b < a && b < c) {
			theSmallest = b;
		}
		else if(c < a && c < b) {
			theSmallest = c;
		}
		else if(a == b || a == c || b == c) {
			theSmallest = -1.0;
		}
		 
		return theSmallest;
	}
}
