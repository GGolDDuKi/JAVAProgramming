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
		System.out.print("정수 몇개? ");
		int cnt = sc.nextInt();
		if(cnt <= 0 || cnt > 100) {
			System.out.print("범위를 벗어났습니다");
			sc.close();
			return;
		}
		int arr[] = new int[cnt];
		
		for(int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 100 + 1);	//1~100 범위의 랜덤 정수 -double형을 반환하기 때문에 int형으로 타입 캐스팅, 소수점 두자리까지 표현해서 *100, 0이 나올 경우를 대비해 +1
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
