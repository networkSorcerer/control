package exam_switch;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String []args) {
		int score = 0;
		Scanner input = new Scanner (System.in);
		
		System.out.print("점수는 0~100 사이로 입력해 주세요");
		score = input.nextInt();
		
		char grade;
		System.out.printf("점수 = %d", score);
		
		switch(score / 10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		
		System.out.printf("학점 = %c" , grade);
		
		input.close();
	}
}
