import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CardGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();		//���� �߻�
		int card;
		int low, high;
		int trycnt;		//�õ�Ƚ��
		
		while(true) {
			card = r.nextInt(100);		//0~99 ���� ����
			low = 0; high = 99;
			trycnt = 1;
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");		//�� �Է¹ް� ���� ����
			
			while(true) {
				System.out.println(low + " ~ " + high);
				System.out.println(trycnt + " >> ");
				
				int n = 0;
				try {
					n = sc.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("�������� �Է��ϼž� �մϴ�.");		//���ܻ��� ��ġ
					sc.nextLine();
					continue;
				}
				
				if(n > high || n < low)
					System.out.println("������ ������.");
				else {
					if(n == card) {
						System.out.println("�¾ҽ��ϴ�.");
						break;
					}
					else if(n > card) {
						System.out.println("�� ����");
						high = n;
					}
					else {
						System.out.println("�� ����");
						low = n;
					}
				}
				trycnt++;		//�õ�Ƚ�� ����
			}		//inner while
			
			
			System.out.print("�ٽ� �õ��ϰڽ��ϱ�? y/n >> ");
			if(sc.next().equals("n"))
				break;
		}	//outer while
		
		sc.close();
	}

}
