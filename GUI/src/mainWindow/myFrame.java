package mainWindow;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class myFrame extends JFrame implements ActionListener {
	JButton button;
	JLabel label;

	myFrame() {
		ImageIcon icon = new ImageIcon("point.png");
		ImageIcon icon2 = new ImageIcon("face.png");
		label= new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);

		JButton button = new JButton();
		button.setBounds(50, 100, 250, 100);
		button.addActionListener(e -> System.out.println("poo"));
		button.setText("my button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.CENTER);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(-15);
		button.setForeground(Color.cyan);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());

		this.setTitle("Jthis title goes here");
		this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setLayout(null);

//		ImageIcon image = new ImageIcon("logo.png");
//		this.setIconImage(image.getImage());
		// change icon this
		this.getContentPane().setBackground(Color.green);
//		this.getContentPane().setBackground(new Color(255,0,0));
		this.add(button);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println("yes");
			label.setVisible(true);
			
		}

	}

}
