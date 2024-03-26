import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("연산 >> ");
		
		int a = sc.nextInt();
		String c = sc.next();
		int b = sc.nextInt();
		
		if(c.equals("+"))			//C와 달리 Java에서는 String에 대한 비교를 할 때, '=='가 아닌 equals()를 사용함
			answer = a + b;
		else if (c.equals("-"))
			answer = a - b;
		else if (c.equals("*"))
			answer = a * b;
		else if (c.equals("/")) {
			if(b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				sc.close();
				return;
			}
			answer = a / b;
		}
		else {
			System.out.println("사칙연산만 지원합니다.");
			sc.close();
			return;
		}
		
		System.out.print(a + c + b + "의 계산 결과는 " + answer);
		sc.close();
	}
}
