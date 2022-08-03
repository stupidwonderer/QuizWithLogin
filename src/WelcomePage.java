import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage implements ActionListener {
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello!");
	JButton startbtn= new JButton("START QUIZ");
	
	WelcomePage(String userId){
		
		welcomeLabel.setBounds(0, 0, 450, 20);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
		welcomeLabel.setText("Hello " + userId);
		startbtn.setBounds(20, 100, 150, 20);
		startbtn.addActionListener(this);
		
		frame.add(welcomeLabel);
		frame.add(startbtn);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==startbtn) {
			Quiz quizapp= new Quiz("New Quiz");
			frame.setVisible(false);
			
		}
	}
	
}
