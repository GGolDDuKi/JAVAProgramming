import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseUpDown extends JFrame{
	
	public MouseUpDown() {
		setTitle("���콺 Ŭ�� �̺�Ʈ â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		label.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("�����");
			}
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseUpDown();
	}

}
