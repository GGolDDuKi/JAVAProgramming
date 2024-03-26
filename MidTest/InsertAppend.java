import java.lang.StringBuffer;
import java.util.Scanner;

public class InsertAppend {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print(">>");
		str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		
		while(true) {
			String command;
			String[] order;
			String sch = " SCH ";
			
			System.out.print("명령: ");
			command = sc.nextLine();
			
			if(command.equals("그만")) {
				System.out.print("종료합니다");
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
				int index = sb.indexOf(order[1]);
				
				if(index == -1) {
					System.out.println("찾을 수 없습니다!");
					continue;
				}
				
				if(order[0].equals("insert")) {
					sb.insert(index, sch);
				}
				else if(order[0].equals("append")) {
					sb.insert(index + order[1].length(), sch);
				}
				else {
					System.out.println("잘못된 명령입니다.");
					continue;
				}
				
				System.out.println(sb.toString());
			}
		}
		sc.close();
	}

}
