import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class BombGUI extends JFrame {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JLabel labels[] = new JLabel[30];
	
	public BombGUI(){
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setLayout(new GridLayout(5,6));
		panel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		for(int i = 0; i < 30; i++){
			labels[i] = new JLabel();
			labels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			panel.add(labels[i]);
		}
		frame.add(panel);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new BombGUI();

	}

}
