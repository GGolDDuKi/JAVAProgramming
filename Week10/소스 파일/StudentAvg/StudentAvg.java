import java.util.*;

public class StudentAvg {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Student> dept = new ArrayList<Student>();
	
	private void read() {
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
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
			
			//StringTokenizer(s, ',') - double�� ParseDouble
			//Student ��ü ����
			//ArrayList�� Student ��ü �߰�
		}
	}
	
	private void printAll() {
		
		for(int i = 0; i < dept.size(); i++) {
			System.out.println("-------------------------------");
			
			System.out.println("�̸� : " + dept.get(i).getName());
			System.out.println("�а� : " + dept.get(i).getMajor());
			System.out.println("�й� : " + dept.get(i).getId());
			System.out.println("������� : " + dept.get(i).getGrade());
			
			System.out.println("-------------------------------");
		}
		
		//ArrayList�� size() ��ŭ ���� ���鼭 Student ��ü �о��
		//�÷����� ȭ�� ��� student.getName(), student.getMajor()...
		
	}
	
	private void search() {
		while(true) {
			System.out.print("�л� �̸� >> ");
			String s = sc.next();
			
			if(s.equals("�׸�")) {
				break;
			}
			
			for(int i = 0; i < dept.size(); i++) {
				if(dept.get(i).getName().equals(s)) {
					System.out.println(dept.get(i).getName() + ", " + dept.get(i).getMajor()
							+ ", " + dept.get(i).getId() + ", " + dept.get(i).getGrade());
				}
			}
		}
		//���ѷ��� (�׸� ������ ���߱�)
		//Scanner�� �˻��� �б�
		//ArrayList size() ��ŭ ���� ���鼭 �˻�
		//�˻� ��� ������ ȭ�� ���
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
