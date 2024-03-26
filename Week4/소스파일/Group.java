import java.util.Scanner;

public class Group {
	private char type;	//S, A, B
	private Seat[] seats;
	private Scanner sc = new Scanner(System.in);
	
	public Group(char type, int num) {
		this.type = type;
		seats = new Seat[num];
		for(int i = 0; i < seats.length; i++)
			seats[i] = new Seat();
	}
	
	public boolean reserve() {
		String name;	//�Է¹��� �����ڸ�
		int no;		//�Է¹��� �¼���ȣ
		
		show();		//�¼� ���� ��Ȳ ���
		System.out.print("�̸� >> ");
		name = sc.next();
		System.out.print("��ȣ >> ");
		no = sc.nextInt();
		
		if(no < 1 || no >= seats.length) {
			System.out.println("�߸��� �¼���ȣ�Դϴ�.");
			return false;
		}
		
		if(seats[no-1].isOccupied()) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
			return false;
		}
		
		seats[no-1].reserve(name);
		return true;
	}
	
	public boolean cancel() {
		show();
		System.out.println("�̸� >> ");
		String name = sc.next();
		
		if(name != null) {
			for(int i = 0; i < seats.length; i++) {
				if(seats[i].match(name)) {
					seats[i].cancel();
					return true;
				}
			}
			System.out.println("������ �̸��� ã�� �� �����ϴ�.");
		}
		return false;
	}
	
	public void show() {
		System.out.print(type + " >> ");
		for(int i = 0; i < seats.length; i++) {
			if(seats[i].isOccupied())
				System.out.print(seats[i].getName());
			else
				System.out.print("---");
			System.out.print(" ");
		}
		System.out.println();
	}
}
