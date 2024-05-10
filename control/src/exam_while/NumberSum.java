package exam_while;

import java.util.Scanner;

public class NumberSum {
	public static void main(String []args) {
		int num, su=1, sum=0;
		Scanner input = new Scanner(System.in);
		
		while(su<=5) {
			System.out.println(su + "번째 수 입력 : ");
			num = input.nextInt();
			sum=sum+num;
			su++;
		}
		System.out.printf("입력 받은 수 \n합계 : %d 평균 : %.1f", sum, ((double)sum/(su-1)));
	}
}
