import java.util.StringTokenizer;
import java.util.Scanner;

/*
public class CountToken {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print(">> ");
			String str = sc.nextLine();
			
			if(str.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(str," ");
			int count = st.countTokens();
			System.out.println("어절의 개수는 " + count);
		}
		
		sc.close();
	}
}
*/

public class CountToken{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String str = sc.nextLine();
			
			if(str.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}
			
			String [] words = str.split(" ");
			int token = words.length;
			System.out.println("어절의 개수는 " + token);
		}
		
		sc.close();
	}
}