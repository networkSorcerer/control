package exam_while;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String [] args ) {
		int sum = 0;
		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int n = scanner.nextInt();
		
		while (n != -1) {
			sum += n;
			n = scanner.nextInt();
			i++;
		}
		
		if (i == 0) 
			System.out.println("입력된 수가 없습니다");
		else
			System.out.print(sum);
		scanner.close();
	}
}
