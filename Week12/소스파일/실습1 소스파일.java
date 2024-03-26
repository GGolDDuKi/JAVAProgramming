import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame(String title) {
		super(title);
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("Let's study Java");
	}

}
