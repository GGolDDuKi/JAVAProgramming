import java.util.Scanner;

public class Game369 {
	
	public static void main(String[] args) {
		int num, count = 0;
		Scanner sc = new Scanner(System.in);		
		System.out.print("1~99 »çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À >> ");
		
		num = sc.nextInt();
		
		if(num >= 1 && num <= 99) {
			
			if(num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
				count++;
			}
			if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
				count++;
			}
			
			if(count == 0)
				System.out.println("¹Ú¼ö¾øÀ½");
			else if(count == 1)
				System.out.println("¹Ú¼öÂ¦");
			else
				System.out.println("¹Ú¼öÂ¦Â¦");
		}
		else
			System.out.println("¼ıÀÚÀÇ ¹üÀ§¸¦ ¹ş¾î³µ½À´Ï´Ù");
		sc.close();
	}

}
