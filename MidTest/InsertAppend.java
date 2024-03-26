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
			
			System.out.print("���: ");
			command = sc.nextLine();
			
			if(command.equals("�׸�")) {
				System.out.print("�����մϴ�");
				break;
			}
			order = command.split("!");
			
			if(order.length != 2) {
				System.out.println("�߸��� ����Դϴ�.");
			}
			else {
				if(order[0].length() == 0 || order[1].length() == 0) {
					System.out.println("�߸��� ����Դϴ�.");
					continue;
				}
				int index = sb.indexOf(order[1]);
				
				if(index == -1) {
					System.out.println("ã�� �� �����ϴ�!");
					continue;
				}
				
				if(order[0].equals("insert")) {
					sb.insert(index, sch);
				}
				else if(order[0].equals("append")) {
					sb.insert(index + order[1].length(), sch);
				}
				else {
					System.out.println("�߸��� ����Դϴ�.");
					continue;
				}
				
				System.out.println(sb.toString());
			}
		}
		sc.close();
	}

}
