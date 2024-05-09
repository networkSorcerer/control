package exam_switch;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int step = 0;
		String ment = "";
		
		System.out.print("각 층이 정보를 제공하고자 합니다, 층수를 입력해 주세요");
		step = input.nextInt();
		
		if(step > 0 && step <= 5) {
			switch(step) {
			case 1: 
				ment = "약국";
				break;
			case 2: 
				ment = "정형외과";
				break;
			case 3 : 
				ment = "피부과";
				break;
			case 4: 
				ment = "치과";
				break;
			case 5:
				ment = "헬스클럽";
				break;
			}
			System.out.print(step + "은" + ment);
		} else {
			System.out.print("존재하지 않는 층");
		}
		System.out.println("입니다");
		
		input.close();
	}
}
