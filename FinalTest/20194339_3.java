import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TenLabelFrame extends JFrame{
	JLabel[] num = new JLabel[10];
	int click;
	
	public TenLabelFrame() {
		click = 0;
		setTitle("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setLayout(null);
		
		MyMouseListener ml = new MyMouseListener();
		
		setSize(300, 300);
		setVisible(true);
		
		for(int i = 0; i < 10; i++) {
			num[i] = new JLabel(Integer.toString(i));
			num[i].setSize(20,20);
			int x = c.getWidth() - num[i].getWidth();
			int y = c.getHeight() - num[i].getHeight();
			num[i].setLocation((int)(Math.random()*x), (int)(Math.random()*y));
			c.add(num[i]);
			num[i].addMouseListener(ml);
			num[i].setForeground(Color.PINK);
		}
		
		setLocationRelativeTo(null);
	}
	
	class MyMouseListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			JLabel la = (JLabel)e.getSource();
			String n = la.getText();
			if(n.equals(Integer.toString(click))){
				num[click].setVisible(false);
				click++;
				if(click == 10) {
					setVisible(false);
					new TenLabelFrame();
				}
			}
			else {
				setVisible(false);
				new TenLabelFrame();
			}
		}
	}
	
	public static void main(String[] args) {
		new TenLabelFrame();
	}

}
