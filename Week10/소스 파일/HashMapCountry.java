import java.util.HashMap;
import java.util.Scanner;

public class HashMapCountry {
	
	public static void main(String[] args) {
		HashMap<String, Integer> country = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 입력하세요. (예 : Korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String s = sc.next();
			
			if(s.equals("그만")) {
				break;
			}
			
			int n = sc.nextInt();
			country.put(s, n);
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String s = sc.next();
			
			if(s.equals("그만")) {
				break;
			}
			
			Integer n = country.get(s);
			
			if(n == null) {
				System.out.println(s + " 나라는 없습니다.");
			}
			else
				System.out.println(s + "의 인구는 " + n);
		}
		sc.close();
	}

}
