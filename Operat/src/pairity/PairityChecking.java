package pairity;

import java.util.Scanner;

public class PairityChecking {

	public static void main(String[] args) {
		System.out.print("������� ����� �����: ");
		Scanner scan = new Scanner(System.in);
		boolean checkResult;
		
		if(scan.hasNextInt()) {
			checkResult = checkEven(scan.nextInt());
			System.out.println(checkResult == true ? "��������� ����� - ������!" : "��������� ����� - ��������!");
		}
		else {
			System.err.println("�� ����� �� ����� �����!");
		}
	}
	
	public static boolean checkEven(int num) {
		return num % 2 == 0;
	}

}
