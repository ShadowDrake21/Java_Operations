package pairity;

import java.util.Scanner;

public class PairityChecking {

	public static void main(String[] args) {
		System.out.print("Input an int number: ");
		Scanner scan = new Scanner(System.in);
		boolean checkResult;
		
		if(scan.hasNextInt()) {
			checkResult = checkEven(scan.nextInt());
			System.out.println(checkResult == true ? "Inputted number is even!" : "Inputted number is odd!");
		}
		else {
			System.err.println("Inputted number is not an int!");
		}
	}
	
	public static boolean checkEven(int num) {
		return num % 2 == 0;
	}

}
