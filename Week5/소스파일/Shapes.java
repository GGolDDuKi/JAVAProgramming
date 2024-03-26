interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}

class Circle implements Shape{
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
}

class Oval implements Shape{
	private int width;
	private int height;
	
	public Oval(int width, int height) {
		this.width = width; this.height = height;
	}
	
	public void draw() {
		System.out.println(width + "x" + height + "�� �����ϴ� Ÿ���Դϴ�.");
	}
	
	public double getArea() {
		return PI * width * height;
	}
}

class Rect implements Shape{
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.height = height; this.width = width;
	}
	
	public void draw() {
		System.out.println(width + "x" + height + "ũ���� �簢���Դϴ�.");
	}
	
	public double getArea() {
		return width * height;
	}
}

public class Shapes {
	public static void main(String[] args) {
		Shape[] list = new Shape[3];
		
		list[0] = new Circle(10);	//10�� ������
		list[1] = new Oval(20, 30);		//20*30 �簢���� �����ϴ� Ÿ��
		list[2] = new Rect(10, 40);	//10*40 �簢��
		
		for(int i = 0; i < list.length; i++)
			list[i].redraw();
		for(int i = 0; i < list.length; i++)
			System.out.println("������ " + list[i].getArea());
	}

}
