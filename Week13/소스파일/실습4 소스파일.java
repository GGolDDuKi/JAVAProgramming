import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickRandomC extends JFrame{
	public ClickRandomC() {
		setTitle("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("C");
		c.add(label);
		label.setLocation(100,100);
		label.setSize(20,20);
		
		label.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				Container c = la.getParent();
				int cx = c.getWidth() - la.getWidth();
				int cy = c.getHeight() - la.getHeight();
				int x = (int)(Math.random()*cx);
				int y = (int)(Math.random()*cy);
				la.setLocation(x, y);
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ClickRandomC();

	}

}
