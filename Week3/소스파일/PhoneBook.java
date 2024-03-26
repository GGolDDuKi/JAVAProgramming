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
		System.out.print("인원수 >> ");
		int n = sc.nextInt();
		
		pArray = new Phone[n];
		
		for(int i = 0; i < pArray.length; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >> ");
			String name = sc.next();
			String tel = sc.next();
			
			pArray[i] = new Phone(name,tel);
		}
		
		System.out.println("저장되었습니다...");
	}
	
	String search(String name) {
		for(int i = 0; i < pArray.length; i++) {
			if(pArray[i].getName().equals(name))
				return pArray[i].getTel();
		}
		return null;
	}
	
	void run() {	//연락처 수량을 입력받아서 생성
		read();
		
		while(true) {
			System.out.print("검색할 이름 >> ");		//"그만"을 입력받으면 break;
			String name = sc.next();
			
			if(name.equals("그만")) 			//String 클래스를 비교할 때에는 equals를 쓰는 것 매우 중요
				break;
			
			String tel = search(name);
			
			if(tel == null)
				System.out.println(name + "이 없습니다.");
			else
				System.out.println(name + "의 번호는 " + tel + "입니다.");
			
		}
		sc.close();
	}
	
	public static void main(String args[]) {
		new PhoneBook().run();
	}
	
}