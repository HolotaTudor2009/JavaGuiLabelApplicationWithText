import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		Border border = BorderFactory.createLineBorder(Color.green,3);
		ImageIcon image = new ImageIcon("img.jpg");
		label.setText("Hello! Do you want to code with me?");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0x00FF00));
		label.setFont(new Font("MV Boli", Font.PLAIN,20));
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		//label.setBounds(100,100,250,250);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setIconTextGap();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500);
		frame.setVisible(true);
		//frame.setLayout(null);
		frame.add(label);
		label.setIcon(image);
		frame.pack();
	}
	
}
