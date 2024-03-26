import java.util.Scanner;

public class Calculator {
	
	public static double add (double a, double b){
		return a + b;
	}
	
	public static double  sub(double a, double b){
		return a - b;
	}
	
	public static double mul(double a, double b) {
		return a * b;
	}
	
	public double div(double a, double b) {
		return a / b;
	}
	
	public static String dToI(double d)		//�Ҽ����� .0�� ��� ������ ǥ��
	{
	    if(d == (int) d)
	        return String.format("%d",(int)d);
	    else
	        return String.format("%s",d);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("����>>");
			
			double first = 0;
			String cal;
			double second = 0;
			
			first = sc.nextDouble();
			cal = sc.next();
			second = sc.nextDouble();
			
			if(cal.equals("/") && second == 0) {
				System.out.print("0���� ���� �� �����ϴ�.");
				break;
			}
			
			switch(cal) {
			case "+":
				System.out.println(dToI(first) + "+" + dToI(second) + "=" + dToI(add(first, second)));
				break;
			case "-":
				System.out.println(dToI(first) + "-" + dToI(second) + "=" + dToI(sub(first, second)));
				break;
			case "*":
				System.out.println(dToI(first) + "*" + dToI(second) + "=" + dToI(mul(first, second)));
				break;
			case "/":
				System.out.println(dToI(first) + "+" + dToI(second) + "=" + dToI(add(first, second)));
				break;
			}
		}
		
		sc.close();
	}

}
