import java.io.*;
import java.util.*;

public class NameNum {
	
	public static void main(String[] args) {
		FileWriter fout = null;
		
		int c;
		File f = new File("c:\\temp\\phone.txt");
		try {		//파일 처리를 할 경우 반드시 try, catch로 묶어야 함***
			fout = new FileWriter("c:\\temp\\phone.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("전화번호 입력 프로그램입니다.");
			
			while(true) {
				System.out.print("이름 전화번호 >> ");
				
				String line = sc.nextLine();
				if(line.equals("그만")) {
					break;
				}
				
				fout.write(line + "\r\n");
			}
			System.out.println(f.getPath() + "에 저장하였습니다.");
			
			sc.close();
			fout.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
