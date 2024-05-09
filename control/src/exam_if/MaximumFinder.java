package exam_if;

import java.util.Scanner;

public class MaximumFinder {
	public static void main(String args[]) {
		int number1, number2, number3;
		int maximumValue;
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("첫번째 정수를 입력하세요");
		number1 = input.nextInt();
		System.out.print("두째 정수를 입력하세요");
		number2 = input.nextInt();
		System.out.print("셋째 정수를 입력하세요");
		number3 = input.nextInt();
		
		input.close();
		
		if(number1 > number2) {
			maximumValue = number1;
		} else {
			maximumValue = number2;
		}
		
		if (number3 > maximumValue) {
			maximumValue = number3;
		}
		System.out.println("최대값은 : " + maximumValue);
	}
	
}
