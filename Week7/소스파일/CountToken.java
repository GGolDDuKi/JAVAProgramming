import java.util.StringTokenizer;
import java.util.Scanner;

/*
public class CountToken {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print(">> ");
			String str = sc.nextLine();
			
			if(str.equals("�׸�")) {
				System.out.println("�����մϴ�");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(str," ");
			int count = st.countTokens();
			System.out.println("������ ������ " + count);
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
			
			if(str.equals("�׸�")) {
				System.out.println("�����մϴ�");
				break;
			}
			
			String [] words = str.split(" ");
			int token = words.length;
			System.out.println("������ ������ " + token);
		}
		
		sc.close();
	}
}