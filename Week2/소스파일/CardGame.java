import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CardGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();		//난수 발생
		int card;
		int low, high;
		int trycnt;		//시도횟수
		
		while(true) {
			card = r.nextInt(100);		//0~99 난수 정수
			low = 0; high = 99;
			trycnt = 1;
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");		//수 입력받고 게임 시작
			
			while(true) {
				System.out.println(low + " ~ " + high);
				System.out.println(trycnt + " >> ");
				
				int n = 0;
				try {
					n = sc.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("정수만을 입력하셔야 합니다.");		//예외사항 조치
					sc.nextLine();
					continue;
				}
				
				if(n > high || n < low)
					System.out.println("범위를 벗어났어요.");
				else {
					if(n == card) {
						System.out.println("맞았습니다.");
						break;
					}
					else if(n > card) {
						System.out.println("더 낮게");
						high = n;
					}
					else {
						System.out.println("더 높게");
						low = n;
					}
				}
				trycnt++;		//시도횟수 증가
			}		//inner while
			
			
			System.out.print("다시 시도하겠습니까? y/n >> ");
			if(sc.next().equals("n"))
				break;
		}	//outer while
		
		sc.close();
	}

}
