import java.util.Scanner;

public class Concert {
	private String hallName;
	private Scanner sc = new Scanner(System.in);
	private Group[] group = new Group[3]; // S, A, B
	
	public Concert(String hallName) {
		this.hallName = hallName;
		group[0] = new Group('S', 10);
		group[1] = new Group('A', 10);
		group[2] = new Group('B', 10);
	}
	
	private void reserve() {
		System.out.print("�¼����� S(1), A(2), B(3) >> ");
		int type = sc.nextInt();
		if(type < 1 || type > 3) {
			System.out.println("�߸��� �¼� Ÿ���Դϴ�.");
			return;
		}
		
		group[type-1].reserve();
	}
	private void search() {
		for(int i = 0; i < group.length; i++) 
			group[i].show();
		System.out.println("<<< ��ȸ�� �Ϸ��Ͽ����ϴ�. >>>");
	}
	private void cancel() {
		System.out.println("�¼� S:1, A:2, B:3 >> ");
		int type = sc.nextInt();
		if(type < 1 || type > 3) {
			System.out.println("�߸��� �¼� Ÿ���Դϴ�.");
			return;
		}
		
		group[type-1].cancel();
	}
	
	public void run() {
		
		System.out.println(hallName + "���� �ý����Դϴ�.");
		int choice = 0;	//����ڰ� ������ ��� 1:���� 2:��ȸ 3:��� 4:������
		
		while(choice != 4) {
			System.out.print("���� : 1, ��ȸ : 2, ��� : 3, ������ : 4 >> ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:		//����
				reserve();
				break;
			case 2:		//��ȸ
				search();
				break;
			case 3:		//���
				cancel();
				break;
			case 4:		//������
				break;
			default:
				System.out.println("�߸� �Է��߽��ϴ�.");
					
			}	//end of switch
		}	//end of while
	}	//end of run
}
