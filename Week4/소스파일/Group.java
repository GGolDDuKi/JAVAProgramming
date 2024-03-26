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
		String name;	//입력받은 예약자명
		int no;		//입력받은 좌석번호
		
		show();		//좌석 예약 현황 출력
		System.out.print("이름 >> ");
		name = sc.next();
		System.out.print("번호 >> ");
		no = sc.nextInt();
		
		if(no < 1 || no >= seats.length) {
			System.out.println("잘못된 좌석번호입니다.");
			return false;
		}
		
		if(seats[no-1].isOccupied()) {
			System.out.println("이미 예약된 좌석입니다.");
			return false;
		}
		
		seats[no-1].reserve(name);
		return true;
	}
	
	public boolean cancel() {
		show();
		System.out.println("이름 >> ");
		String name = sc.next();
		
		if(name != null) {
			for(int i = 0; i < seats.length; i++) {
				if(seats[i].match(name)) {
					seats[i].cancel();
					return true;
				}
			}
			System.out.println("예약자 이름을 찾을 수 없습니다.");
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
