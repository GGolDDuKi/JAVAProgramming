import java.lang.StringBuffer;
import java.util.Scanner;

public class ChangeString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print(">>");
		str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		
		while(true) {
			String command;
			String[] order;
			
			System.out.print("명령 : ");
			command = sc.nextLine();
			if(command.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}
			
			order = command.split("!");
			
			if(order.length != 2) {
				System.out.println("잘못된 명령입니다.");
			}
			else {
				if(order[0].length() == 0 || order[1].length() == 0) {
					System.out.println("잘못된 명령입니다.");
					continue;
				}
				
				int index = sb.indexOf(order[0]);	//order[0]이 sb내에 있을 경우 찾아서 인덱스값을 반환
				
				if(index == -1) {
					System.out.println("찾을 수 없습니다!");
					continue;
				}
				
				sb.replace(index, index + order[0].length(), order[1]);
				//스트링버퍼 타입은 출력 불가 -> 스트링 타입으로 바꿔줘야함
				System.out.println(sb.toString());
			}
		}
		sc.close();
	}

}
