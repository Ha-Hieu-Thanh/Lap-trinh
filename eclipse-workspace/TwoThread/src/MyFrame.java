import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 1280, HEIGHT = 720;
	private JButton button1, button2;
	private JPanel mainPanel;
	public static JLabel label;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MyFrame();
			}
		});
	}
	public MyFrame(){
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setMaximumSize(new Dimension(WIDTH, HEIGHT + 200));
	setMinimumSize(new Dimension(WIDTH, HEIGHT + 20));
	setPreferredSize(new Dimension(WIDTH, HEIGHT + 20));
	setLocationRelativeTo(null);
	setResizable(true);
	setBackground(Color.GRAY);
	button1 = new JButton("Button 1");
	button2 = new JButton("Button 2");
	button1.setBounds(1, 1, 30, 30);
	button2.setBounds(60,60,30,30);
	button1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==button1) {
			while(true) {
				int i=0;
				i++;
				MyFrame.label.setText(""+i);
				label.setVisible(true);
			}
			}
		}
		
	});
	mainPanel = new JPanel();
	mainPanel.setLayout(null);
	mainPanel.setBackground(Color.WHITE);
	add(mainPanel);
	label = new JLabel("");
	label.setForeground(Color.RED);
	label.setBounds(1000, 500, 200, 50);
	mainPanel.add(button1);
	mainPanel.add(button2);
	mainPanel.add(label);
	setVisible(true);
	}

	
}