package mainWindow;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

@SuppressWarnings("all")

public class labels {
	public static void main(String[] args) {
		
//		ImageIcon image = new ImageIcon("file.png");
		Border border = BorderFactory.createLineBorder(Color.green);
		JLabel label = new JLabel();
		label.setText("this is a label");
//		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);//set text left, center, right of imageIcon
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.green);
		label.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setIconTextGap(100);label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
//		label.setBounds(0,0,250,250);
		
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
//		frame.setResizable(false);
		frame.setVisible(true);
		frame.add(label);
//		frame.setLayout(null);
		frame.pack();
	}

}
