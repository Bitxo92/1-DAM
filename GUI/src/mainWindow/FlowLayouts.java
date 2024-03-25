package mainWindow;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayouts {
	public static void main(String[] args) {
		JFrame frame;
		JButton button1, button2, button3, button4, button5;
		JPanel panel;
		
		frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,250));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout());
		
		
		button1= new JButton("1");
		button2= new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5= new JButton("5");
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		
		frame.add(panel);
		frame.setVisible(true);
	}

}
