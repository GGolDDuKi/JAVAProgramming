import java.util.Scanner;

//�ǽ�1
public class Median {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 3���� �Է��Ͻÿ� > ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int median = a;
		
		if((a >= b && a <= c) || (a >= c && a <= b))
			median = a;
		else if ((b >= a && b <= c) || (b >= c && b <= a))
			median = b;
		else
			median = c;
		
		System.out.println("�߰� ���� " + median);
		sc.close();
	}
}