import java.util.Scanner;

public class StringMove {
	
	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		
		int len = text.length();
		
		for(int i = 0; i < len; i++) {
			String first = text.substring(0, 1);
			String remain = text.substring(1);
			text = remain + first;
			System.out.println(text);
		}
		
		sc.close();
	}
}
