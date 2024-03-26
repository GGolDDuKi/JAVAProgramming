import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	
	public Phone() {};
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	String getName() {
		return name;
	}
	String getTel() {
		return tel;
	}
}

public class PhoneBook{
	private Phone[] pArray;
	private Scanner sc;
	
	public PhoneBook() {
		sc = new Scanner(System.in);
	}
	
	void read() {
		System.out.print("�ο��� >> ");
		int n = sc.nextInt();
		
		pArray = new Phone[n];
		
		for(int i = 0; i < pArray.length; i++) {
			System.out.println("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�) >> ");
			String name = sc.next();
			String tel = sc.next();
			
			pArray[i] = new Phone(name,tel);
		}
		
		System.out.println("����Ǿ����ϴ�...");
	}
	
	String search(String name) {
		for(int i = 0; i < pArray.length; i++) {
			if(pArray[i].getName().equals(name))
				return pArray[i].getTel();
		}
		return null;
	}
	
	void run() {	//����ó ������ �Է¹޾Ƽ� ����
		read();
		
		while(true) {
			System.out.print("�˻��� �̸� >> ");		//"�׸�"�� �Է¹����� break;
			String name = sc.next();
			
			if(name.equals("�׸�")) 			//String Ŭ������ ���� ������ equals�� ���� �� �ſ� �߿�
				break;
			
			String tel = search(name);
			
			if(tel == null)
				System.out.println(name + "�� �����ϴ�.");
			else
				System.out.println(name + "�� ��ȣ�� " + tel + "�Դϴ�.");
			
		}
		sc.close();
	}
	
	public static void main(String args[]) {
		new PhoneBook().run();
	}
	
}