import javax.swing.*;
import java.awt.*;


public class Calculator extends JFrame {

	public Calculator() {
		super("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new NorthPanel(), BorderLayout.NORTH);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}

class SouthPanel extends JPanel{
	public SouthPanel() {
		setBackground(Color.YELLOW);
		setOpaque(true);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JLabel("계산 결과"));
		add(new TextField(15));
	}
}

class CenterPanel extends JPanel{
	public CenterPanel() {
		setBackground(Color.WHITE);
		setOpaque(true);
		
		setLayout(new GridLayout(4, 4, 5, 5));
		
		for(int i = 0; i < 10; i++) {
			JButton btn = new JButton(Integer.toString(i));
			add(btn);
		}
		
		add(new JButton("CE"));
		add(new JButton("계산"));
		
		JButton[] b = { new JButton("+"), new JButton("-"),
				new JButton("x"), new JButton("/") }; 
		
		for(int i = 0; i < b.length; i++) {
			b[i].setBackground(Color.CYAN);
			add(b[i]);
		}
		
	}
}

class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setOpaque(true);
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		add(new JLabel("수식입력"));
		add(new TextField(15));
	}
}


