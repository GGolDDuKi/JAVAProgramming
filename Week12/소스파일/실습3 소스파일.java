import javax.swing.*;
import java.awt.*;


public class TenButtonFrame extends JFrame{
	
	public TenButtonFrame() {
		super("Ten Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		
		JButton[] btn = new JButton[10];
		
		Color[] color = { Color.RED, Color.ORANGE, Color.YELLOW,
				Color.GREEN, Color.BLUE, Color.PINK, Color.GRAY, 
				Color.BLACK, Color.CYAN, Color.WHITE };
		
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setOpaque(true);
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}
		
		setSize(500,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TenButtonFrame();
	}
}
