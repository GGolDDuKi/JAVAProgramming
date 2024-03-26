import java.util.Scanner;

public class Game369 {
	
	public static void main(String[] args) {
		int num, count = 0;
		Scanner sc = new Scanner(System.in);		
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		
		num = sc.nextInt();
		
		if(num >= 1 && num <= 99) {
			
			if(num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
				count++;
			}
			if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
				count++;
			}
			
			if(count == 0)
				System.out.println("박수없음");
			else if(count == 1)
				System.out.println("박수짝");
			else
				System.out.println("박수짝짝");
		}
		else
			System.out.println("숫자의 범위를 벗어났습니다");
		sc.close();
	}

}
