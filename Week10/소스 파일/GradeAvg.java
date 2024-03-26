import java.util.ArrayList;
import java.util.Scanner;

public class GradeAvg {
	
	
	public static void main(String[] args) {
		ArrayList<Character> grade = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >>");
		
		for(int i = 0; i < 6; i++) {
			String s = sc.next();
			char ch = s.charAt(0);
			if((ch >= 'A' && ch <= 'D') || ch  == 'F') {
				grade.add(ch);
			}
			else {
				System.out.println("Invalid Grade");
				sc.close();
				return;
			}
		}
		
		double score = 0.0;
		for(int i = 0; i < grade.size(); i++) {
			char ch = grade.get(i);
			switch(ch) {
			case 'A':
				score += 4.0;
				break;
			case 'B':
				score += 3.0;
				break;
			case 'C':
				score += 2.0;
				break;
			case 'D':
				score += 1.0;
				break;
			case 'F':
				score += 0.0;
				break;
			}
		}
		
		System.out.println("평균 점수는 " + score / grade.size());
		sc.close();
	}

}
