import java.util.Scanner;

public class Game369 {
	
	public static void main(String[] args) {
		int num, count = 0;
		Scanner sc = new Scanner(System.in);		
		System.out.print("1~99 ������ ������ �Է��Ͻÿ� >> ");
		
		num = sc.nextInt();
		
		if(num >= 1 && num <= 99) {
			
			if(num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
				count++;
			}
			if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
				count++;
			}
			
			if(count == 0)
				System.out.println("�ڼ�����");
			else if(count == 1)
				System.out.println("�ڼ�¦");
			else
				System.out.println("�ڼ�¦¦");
		}
		else
			System.out.println("������ ������ ������ϴ�");
		sc.close();
	}

}
