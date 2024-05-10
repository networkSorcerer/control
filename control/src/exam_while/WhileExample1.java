package exam_while;

public class WhileExample1 {
	public static void main(String []args) {
		int i = 1;
		int evenhap = 0;
		int oddhap = 0;
		while(i <= 100) {
			if((i % 2) ==0) {
				evenhap +=i;
			} else {
				oddhap += i;
			}
			i++;
		}
		System.out.println(evenhap);
		System.out.println(oddhap);
		System.out.println();
		
		int num, evenSum, oddSum;
		for (num =0, evenSum = 0; num <= 100; num = num + 2) {
			evenSum += num;
		}
		System.out.println("짝수의 합" + evenSum);
		
		for (num = 1, oddSum = 0; num <= 100; num = num +2) {
			oddSum += num;
		}
		System.out.println(oddSum);
	}
}
