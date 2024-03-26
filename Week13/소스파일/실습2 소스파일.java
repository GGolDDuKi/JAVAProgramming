import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseDraggingFrame extends JFrame{

	public MouseDraggingFrame() {
		setTitle("�巡�뵿�� YELLOW�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		
		MyMouseListener ml = new MyMouseListener();
		
		c.addMouseMotionListener(ml);
		c.addMouseListener(ml);
		
		setSize(250,150);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		public void mouseDragged(MouseEvent e) {
			JComponent c = (JComponent)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			JComponent c = (JComponent)e.getSource();
			c.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String[] args) {
		new MouseDraggingFrame();

	}

}
