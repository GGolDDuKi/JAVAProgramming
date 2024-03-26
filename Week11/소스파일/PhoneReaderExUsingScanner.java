import java.io.*;
import java.util.Scanner;

public class PhoneReaderExUsingScanner {
	
	public static void main(String[] args) {
		FileReader fr = null;
		File f = new File("c:\\temp\\phone.txt");
		
		try {
			fr = new FileReader(f);
			Scanner sc = new Scanner(fr);
			
			System.out.println(f.getPath() + "를 출력합니다.");
			while(sc.hasNext()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			fr.close();
			sc.close();
			
		}catch(IOException e) {
			
		}
	}

}
