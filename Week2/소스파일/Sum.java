import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < args.length; i++) {
			System.out.print(args[i]);
		}
		System.out.print("\n");
		for(int i = 0; i < args.length; i++) {
			try {
			int n = Integer.parseInt(args[i]);
			sum += n;
			} catch(NumberFormatException e) {
				
			}
		}
		System.out.println(sum);
	}

}
