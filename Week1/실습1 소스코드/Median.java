import java.util.Scanner;

//실습1
public class Median {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하시오 > ");
		
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
		
		System.out.println("중간 값은 " + median);
		sc.close();
	}
}