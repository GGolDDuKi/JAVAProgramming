import java.util.Scanner;

public class RandomInput {
	
	public static boolean exists(int a[], int from, int r) {
		for(int j = 0; j < from; j++) {
			if(a[j] == r)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �? ");
		int cnt = sc.nextInt();
		if(cnt <= 0 || cnt > 100) {
			System.out.print("������ ������ϴ�");
			sc.close();
			return;
		}
		int arr[] = new int[cnt];
		
		for(int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 100 + 1);	//1~100 ������ ���� ���� -double���� ��ȯ�ϱ� ������ int������ Ÿ�� ĳ����, �Ҽ��� ���ڸ����� ǥ���ؼ� *100, 0�� ���� ��츦 ����� +1
			if(exists(arr,i,r)) {
				i--;
				continue;
			}
			arr[i] = r;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
