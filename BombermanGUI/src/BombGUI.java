import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class BombGUI extends JFrame {
	private static final long serialVersionUID = 1L;
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JLabel labels[] = new JLabel[315];
	
	public BombGUI(){
		frame.setSize(800, 700);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setLayout(new GridLayout(15,21));
		panel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		for(int i = 0; i < 315; i++){
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
