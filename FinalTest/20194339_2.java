import java.io.*;
import java.util.*;

public class AppendFile {
	File targetFile = null;
	FileWriter fout = null;
	Vector<Character> intVector = new Vector<Character>();
	
	public void readFile(String fileName) {
		targetFile = new File(fileName);
		int c;
		try {
			FileReader fd = new FileReader(fileName);
			while((c = fd.read()) != -1) {
				intVector.add((char) c);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run() throws IOException {
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		File f = new File("appended.txt");
		FileWriter fw = new FileWriter(f);
		PrintWriter writer = new PrintWriter(fw);
		
		try {
			fout = new FileWriter("appended.txt");
			Scanner sc = new Scanner(System.in);
			System.out.print("ù ��° ���� �̸��� �Է��ϼ��� >> ");
			String fileName = sc.nextLine();
			readFile(fileName);
			System.out.print("�� ��° ���� �̸��� �Է��ϼ��� >> ");
			fileName = sc.nextLine();
			readFile(fileName);
			
			Iterator<Character> it = intVector.iterator();
			
			while(it.hasNext()){
				writer.write(it.next());
			}
			
			System.out.println("������Ʈ ���� �ؿ� " + f.getPath() + " ���Ͽ� �����Ͽ����ϴ�.");
			
			sc.close();
			fout.close();
			
		}catch(IOException e) {
			System.out.println("����� ����");
		}
	}
	
	public static void main(String[] args) throws IOException {
		AppendFile af = new AppendFile();
		af.run();
	}

}
