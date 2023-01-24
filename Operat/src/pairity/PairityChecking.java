package pairity;

import java.util.Scanner;

public class PairityChecking {

	public static void main(String[] args) {
		System.out.print("Введите целое число: ");
		Scanner scan = new Scanner(System.in);
		boolean checkResult;
		
		if(scan.hasNextInt()) {
			checkResult = checkEven(scan.nextInt());
			System.out.println(checkResult == true ? "Введенное число - парное!" : "Введенное число - непарное!");
		}
		else {
			System.err.println("Вы ввели не целое число!");
		}
	}
	
	public static boolean checkEven(int num) {
		return num % 2 == 0;
	}

}
