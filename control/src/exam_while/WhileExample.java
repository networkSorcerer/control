package exam_while;

public class WhileExample {
	public static void main(String []args) {
		int i =1;
		System.out.print("정수 :");
		while (i <= 5) {
			System.out.print(i++ + " ");
		}
		System.out.println();
		
		i = 5;
		System.out.print("1. 정수 : " );
		while (i > 0) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println();
		
		i = 5;
		System.out.print("2 정수 : ");
		while (true) {
			System.out.print(i + " ");
			i--;
			if (i < 1) {
				break;
			}
		}
		
		System.out.println();
		
		int num =1 , sum = 0;
		while (num <= 100) {
			sum+=num++;
		}
		
		System.out.println(sum);
	}
}
