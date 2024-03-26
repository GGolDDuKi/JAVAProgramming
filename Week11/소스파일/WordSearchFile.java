import java.io.*;
import java.util.*;

public class WordSearchFile {
	private File targetFile = null;
	Vector<String> lineVector = new Vector<String>();
	
	public WordSearchFile() {}
	
	private void readFile(String fileName) {
		targetFile = new File(fileName);
		
		try {
			Scanner fScanner = new Scanner(new FileReader(targetFile));
			
			while(fScanner.hasNext()) {
				String line = fScanner.nextLine();
				lineVector.add(line);
			}
			
			fScanner.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private Vector<Integer> searchWord(String word){
		Vector<Integer> noVector = new Vector<Integer>();
		
		for(int i = 0; i < lineVector.size(); i++) {
			String line = lineVector.get(i);
			if(line.indexOf(word) != -1)
				noVector.add(i);
		}
		
		return noVector;
	}
	
	private void printLines(Vector<Integer> noVector) {
		for(int i = 0; i < noVector.size(); i++) {
			int lineNo = noVector.get(i);
			String line = lineVector.get(lineNo);
			System.out.println(lineNo + ": " + line);
		}
	}
	
	public void run() {
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է� >> ");
		
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		
		readFile(fileName);
		
		while(true) {
			System.out.print("�˻��� �ܾ ���� >> ");
			String line = sc.nextLine();
			if(line.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			Vector<Integer> noVector = searchWord(line);
			printLines(noVector);
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		WordSearchFile ws = new WordSearchFile();
		ws.run();
	}
}
