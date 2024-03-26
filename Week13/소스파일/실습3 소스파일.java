import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class KeyPlusMinusFrame extends JFrame{

	public KeyPlusMinusFrame() {
		setTitle("Font Plus Minus Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Java Class");
		c.add(label);
		
		label.setFont(new Font("TimesRoman", Font.PLAIN, 10));
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("TimesRoman", Font.PLAIN, size + 5));
				}
				else if(e.getKeyChar() == '-') {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("TimesRoman", Font.PLAIN, size - 5));
				}
			}
		});
		
		setSize(300,300);
		setVisible(true);
		
		label.setFocusable(true);
		label.requestFocus();
	}
	
	public static void main(String[] args) {
		new KeyPlusMinusFrame();

	}

}
