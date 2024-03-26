import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� >> ");
		
		int a = sc.nextInt();
		String c = sc.next();
		int b = sc.nextInt();
		
		if(c.equals("+"))			//C�� �޸� Java������ String�� ���� �񱳸� �� ��, '=='�� �ƴ� equals()�� �����
			answer = a + b;
		else if (c.equals("-"))
			answer = a - b;
		else if (c.equals("*"))
			answer = a * b;
		else if (c.equals("/")) {
			if(b == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				sc.close();
				return;
			}
			answer = a / b;
		}
		else {
			System.out.println("��Ģ���길 �����մϴ�.");
			sc.close();
			return;
		}
		
		System.out.print(a + c + b + "�� ��� ����� " + answer);
		sc.close();
	}
}
