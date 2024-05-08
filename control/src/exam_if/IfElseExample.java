package exam_if;

import java.util.Scanner;

public class IfElseExample {
	public static void main(String[] args) {
		System.out.print("[예제1]");
		int score = 90;
		String result = "";
		
		if (score >= 60) {
			result = "합격";
		} else {
			result = "불합격";
		}
		System.out.println(result);
		
		System.out.println("[예제2]");
		
		int su = 0;
		String data = "";
		Scanner input = new Scanner(System.in);
		
		System.out.print("짝수와 홀수를 구할 수를 입력해주세요");
		su = input.nextInt();
		
		System.out.println("su의 초기값 : " + su);
		
		if(su%2 == 0) {
			data = "짝수";
		} else {
			data = "홀수";
		}
		
		System.out.println("입력한" + su + "는 " + data +"입니다");
		input.close();
		
	}
}
