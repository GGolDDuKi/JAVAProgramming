import java.io.*;
import java.util.*;

public class NameNum {
	
	public static void main(String[] args) {
		FileWriter fout = null;
		
		int c;
		File f = new File("c:\\temp\\phone.txt");
		try {		//���� ó���� �� ��� �ݵ�� try, catch�� ����� ��***
			fout = new FileWriter("c:\\temp\\phone.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
			
			while(true) {
				System.out.print("�̸� ��ȭ��ȣ >> ");
				
				String line = sc.nextLine();
				if(line.equals("�׸�")) {
					break;
				}
				
				fout.write(line + "\r\n");
			}
			System.out.println(f.getPath() + "�� �����Ͽ����ϴ�.");
			
			sc.close();
			fout.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}
	}
}
