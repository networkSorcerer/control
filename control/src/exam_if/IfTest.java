package exam_if;

import java.util.Scanner;

public class IfTest {
	public static void main(String []args) {
		int su1, su2, temp;
		Scanner input = new Scanner (System.in);
		System.out.print("두수를 입력해 주세요");
		su1 = input.nextInt();
		su2 = input.nextInt();
		
		if(su1 > su2) {
			temp = su1;
			su1 = su2;
			su2 = temp;
		}
		
		System.out.print(su1 + "" + su2);
		input.close();
	}
}
