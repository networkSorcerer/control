package exam_if;

import java.util.Scanner;

public class IfElseIfElseExample {
	public static void main(String [] args) {
		int score = 0;
		Scanner input =  new Scanner(System.in);
		
		System.out.print("점수는 0~ 100 사이로 입력해주세요");
		score = input.nextInt();
		
		char grade;
		
		if(score>=90)
			grade = 'A';
		else if(score>=80)
			grade = 'B';
		else if (score>=70)
			grade = 'C';
		else if (score>60)
			grade = 'D';
		else 
			grade = 'F';
		
		System.out.printf("점수 = %d 학점 = %c", score, grade);
		
		input.close();
		
	}
}
