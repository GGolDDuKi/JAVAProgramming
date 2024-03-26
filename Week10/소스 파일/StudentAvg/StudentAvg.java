import java.util.*;

public class StudentAvg {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Student> dept = new ArrayList<Student>();
	
	private void read() {
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">>");
			String s = sc.nextLine();
			
			StringTokenizer st = new StringTokenizer(s, ",");
			
			Student student = new Student();
			student.setName(st.nextToken());
			student.setMajor(st.nextToken());
			student.setId(st.nextToken());
			student.setGrade(Double.parseDouble(st.nextToken()));
			
			dept.add(student);
			
			//StringTokenizer(s, ',') - double은 ParseDouble
			//Student 객체 생성
			//ArrayList에 Student 객체 추가
		}
	}
	
	private void printAll() {
		
		for(int i = 0; i < dept.size(); i++) {
			System.out.println("-------------------------------");
			
			System.out.println("이름 : " + dept.get(i).getName());
			System.out.println("학과 : " + dept.get(i).getMajor());
			System.out.println("학번 : " + dept.get(i).getId());
			System.out.println("학점평균 : " + dept.get(i).getGrade());
			
			System.out.println("-------------------------------");
		}
		
		//ArrayList의 size() 만큼 루프 돌면서 Student 객체 읽어옴
		//컬럼별로 화면 출력 student.getName(), student.getMajor()...
		
	}
	
	private void search() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String s = sc.next();
			
			if(s.equals("그만")) {
				break;
			}
			
			for(int i = 0; i < dept.size(); i++) {
				if(dept.get(i).getName().equals(s)) {
					System.out.println(dept.get(i).getName() + ", " + dept.get(i).getMajor()
							+ ", " + dept.get(i).getId() + ", " + dept.get(i).getGrade());
				}
			}
		}
		//무한루프 (그만 들어오면 멈추기)
		//Scanner로 검색어 읽기
		//ArrayList size() 만큼 루프 돌면서 검색
		//검색 결과 있으면 화면 출력
	}
	
	public void run() {
		read();
		printAll();
		search();
	}
	
	public static void main(String[] args) {
		StudentAvg manager = new StudentAvg();
		manager.run();

	}

}
