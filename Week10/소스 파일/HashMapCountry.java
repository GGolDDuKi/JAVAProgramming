import java.util.HashMap;
import java.util.Scanner;

public class HashMapCountry {
	
	public static void main(String[] args) {
		HashMap<String, Integer> country = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �̸��� �α��� �Է��ϼ���. (�� : Korea 5000)");
		while(true) {
			System.out.print("���� �̸�, �α� >> ");
			String s = sc.next();
			
			if(s.equals("�׸�")) {
				break;
			}
			
			int n = sc.nextInt();
			country.put(s, n);
		}
		
		while(true) {
			System.out.print("�α� �˻� >> ");
			String s = sc.next();
			
			if(s.equals("�׸�")) {
				break;
			}
			
			Integer n = country.get(s);
			
			if(n == null) {
				System.out.println(s + " ����� �����ϴ�.");
			}
			else
				System.out.println(s + "�� �α��� " + n);
		}
		sc.close();
	}

}
