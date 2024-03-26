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
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		File f = new File("appended.txt");
		FileWriter fw = new FileWriter(f);
		PrintWriter writer = new PrintWriter(fw);
		
		try {
			fout = new FileWriter("appended.txt");
			Scanner sc = new Scanner(System.in);
			System.out.print("첫 번째 파일 이름을 입력하세요 >> ");
			String fileName = sc.nextLine();
			readFile(fileName);
			System.out.print("두 번째 파일 이름을 입력하세요 >> ");
			fileName = sc.nextLine();
			readFile(fileName);
			
			Iterator<Character> it = intVector.iterator();
			
			while(it.hasNext()){
				writer.write(it.next());
			}
			
			System.out.println("프로젝트 폴더 밑에 " + f.getPath() + " 파일에 저장하였습니다.");
			
			sc.close();
			fout.close();
			
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
	
	public static void main(String[] args) throws IOException {
		AppendFile af = new AppendFile();
		af.run();
	}

}
