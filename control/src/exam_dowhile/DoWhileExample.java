package exam_dowhile;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String []args) {
		int num = 0;
		do {
			System.out.println("num의 값 : " + num);
			num++;
		} while (num < 0);
		
		System.out.println();
		
		int i = 1;
		do {
			System.out.print(i+ " ");
			i ++ ;
			
		} while( i <= 10);
		
		System.out.println();
		
		i = 10;
		do {
			System.out.print(i + " ");
			i--;
		} while (i > 0);
		
		System.out.println();
		
		int number = 1, sum = 0;
		do { 
			sum+=number++;
		}while (number <= 100);
		
		System.out.println("1에서 100까지의 합 = " +sum);
		System.out.println();
		
		Scanner scanner = new Scanner (System.in);
		String inputString;
		System.out.println("\n메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		scanner.close();
	}
}
