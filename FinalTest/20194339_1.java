import java.util.*;

public class CustomerManager {

	public static void main(String[] args) {
		String name;
		int point;
		HashMap <String, Integer> info = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
      
		System.out.println("** 포인트 관리 프로그램입니다 **");
		
		while(true) {
			System.out.print("이름과 포인트 입력 >> ");
			name = sc.next();
			point = sc.nextInt();
			
			if(name.equals("그만")) {
				return;
			}
         
			if(info.get(name) == null) {
				info.put(name, point);
			}
			else {
				info.put(name, info.get(name) + point);
			}
			
			Set<String> keys = info.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()) {
				String who = it.next();
				int sumPoint = info.get(who);
				System.out.print(" (" + who + "," + sumPoint + ")");
			}
			System.out.println();
		}
	}
}