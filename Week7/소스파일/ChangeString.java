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
			
			System.out.print("��� : ");
			command = sc.nextLine();
			if(command.equals("�׸�")) {
				System.out.println("�����մϴ�");
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
				
				int index = sb.indexOf(order[0]);	//order[0]�� sb���� ���� ��� ã�Ƽ� �ε������� ��ȯ
				
				if(index == -1) {
					System.out.println("ã�� �� �����ϴ�!");
					continue;
				}
				
				sb.replace(index, index + order[0].length(), order[1]);
				//��Ʈ������ Ÿ���� ��� �Ұ� -> ��Ʈ�� Ÿ������ �ٲ������
				System.out.println(sb.toString());
			}
		}
		sc.close();
	}

}
