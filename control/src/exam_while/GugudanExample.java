package exam_while;

import java.util.Scanner;

public class GugudanExample {
	public static void main (String [] args) {
		int n;
		int i = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("구구단 출력하고 싶은 단 입력");
		n = input.nextInt();
		
		while( n <2 || n > 9) {
			System.out.print("구구단 중 출력하고 싶은 단 ");
			n = input.nextInt();
		}
		
		while (i <= 9) {
			System.out.println(n + " *  " + i  + " = " + (n*i));
			i++;
		}
		
		input.close();
	};
};
