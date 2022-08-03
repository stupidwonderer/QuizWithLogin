
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.*;

	public class Quiz extends JFrame implements ActionListener {
		
		JLabel label;
		JRadioButton radiobuttons[] = new JRadioButton[5]; 
		JButton nextbtn, resultbtn; 
		ButtonGroup bg;
		int count =0,current=0,x=1,y=1,now=0;
		int m[]= new int[10];
		
		
		
		Quiz(String s){
			super(s);
			label= new JLabel();
			add(label);
			bg= new ButtonGroup();
			for(int i=0;i<5;i++) {
				radiobuttons[i]= new JRadioButton();
				add(radiobuttons[i]);
				bg.add(radiobuttons[i]);
				}
			nextbtn = new JButton("NEXT");
			resultbtn = new JButton("RESULT");
			resultbtn.setVisible(false);
			nextbtn.addActionListener(this);
			resultbtn.addActionListener(this);
			add(nextbtn);
			add(resultbtn);
			setData();
			label.setBounds(30, 40,450,20);
			radiobuttons[0].setBounds(50, 80,450,20);
			radiobuttons[1].setBounds(50, 110,450,20);
			radiobuttons[2].setBounds(50, 140,450,20);
			radiobuttons[3].setBounds(50, 170,450,20);
			radiobuttons[4].setBounds(50, 200,450,20);
			nextbtn.setBounds(100, 240, 100, 30);
			resultbtn.setBounds(270, 240, 100, 30);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			setLocation(250,100);
			setVisible(true);
			setSize(600,350);
			
		}
		void setData() {
			radiobuttons[4].setSelected(true);
			if(current==0) {
				label.setText("Question 1");
				radiobuttons[0].setText("Option A");
				radiobuttons[1].setText("Option B");
				radiobuttons[2].setText("Option C");
				radiobuttons[3].setText("Option D");
				
			}
			if(current==1) {
				label.setText("Question 2");
				radiobuttons[0].setText("Option A");
				radiobuttons[1].setText("Option B");
				radiobuttons[2].setText("Option C");
				radiobuttons[3].setText("Option D");
				
			}
			if(current==2) {
				label.setText("Question 3");
				radiobuttons[0].setText("Option A");
				radiobuttons[1].setText("Option B");
				radiobuttons[2].setText("Option C");
				radiobuttons[3].setText("Option D");
				
			}
			if(current==3) {
				label.setText("Question 4");
				radiobuttons[0].setText("Option A");
				radiobuttons[1].setText("Option B");
				radiobuttons[2].setText("Option C");
				radiobuttons[3].setText("Option D");
				
			}
			if(current==4) {
				label.setText("Question 5");
				radiobuttons[0].setText("Option A");
				radiobuttons[1].setText("Option B");
				radiobuttons[2].setText("Option C");
				radiobuttons[3].setText("Option D");
				
			}
			if(current==5) {
				label.setText("Question 6");
				radiobuttons[0].setText("Option A");
				radiobuttons[1].setText("Option B");
				radiobuttons[2].setText("Option C");
				radiobuttons[3].setText("Option D");
				
			}
			if(current==6) {
				label.setText("Question 7");
				radiobuttons[0].setText("Option A");
				radiobuttons[1].setText("Option B");
				radiobuttons[2].setText("Option C");
				radiobuttons[3].setText("Option D");
				
			}
			if(current==7) {
				label.setText("Question 8");
				radiobuttons[0].setText("Option A");
				radiobuttons[1].setText("Option B");
				radiobuttons[2].setText("Option C");
				radiobuttons[3].setText("Option D");
				
			}
			if(current==8) {
				label.setText("Question 9");
				radiobuttons[0].setText("Option A");
				radiobuttons[1].setText("Option B");
				radiobuttons[2].setText("Option C");
				radiobuttons[3].setText("Option D");
				
			}
			if(current==9) {
				label.setText("Question 10");
				radiobuttons[0].setText("Option A");
				radiobuttons[1].setText("Option B");
				radiobuttons[2].setText("Option C");
				radiobuttons[3].setText("Option D");
				
			}
			label.setBounds(30,40,450,20);
			for(int i=0,j=0;i<=90;i+=30,j++) {
				radiobuttons[j].setBounds(50,80+i , 200, 20);
			}
		}
		
		boolean CheckAns() {
			// here all demo Question have answer as option A
			if(current==0) {
				return radiobuttons[0].isSelected();
			}
			if(current==1) {
				return radiobuttons[0].isSelected();
			}
			if(current==2) {
				return radiobuttons[0].isSelected();
			}
			if(current==3) {
				return radiobuttons[0].isSelected();
			}
			if(current==4) {
				return radiobuttons[0].isSelected();
			}
			if(current==5) {
				return radiobuttons[0].isSelected();
			}
			if(current==6) {
				return radiobuttons[0].isSelected();
			}
			if(current==7) {
				return radiobuttons[0].isSelected();
			}
			if(current==8) {
				return radiobuttons[0].isSelected();
			}
			if(current==9) {
				return radiobuttons[0].isSelected();
			}
			else {
				return false;
			}
		}
		public static void main(String[] args) {
			new Quiz("This is a Quiz APP");
			
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==nextbtn) {
				if(CheckAns()) {
					count=count+1;
					current++;
					setData();
					if(current==9) {
						nextbtn.setEnabled(false);
						resultbtn.setVisible(true);
						resultbtn.setText("RESULT");
					}
				} else {
					current++;
					setData();
					if(current==9) {
						nextbtn.setEnabled(false);
						resultbtn.setVisible(true);
						resultbtn.setText("RESULT");
					}
				}
			}
			if(e.getActionCommand().equals("RESULT")) {
				if(CheckAns()) {
					count=count+1;
					current++;
					JOptionPane.showMessageDialog(this, "Correct Answers "+count);
					System.exit(0);
				}else {
					JOptionPane.showMessageDialog(this, "Correct Answers "+count);
					System.exit(0);
				}
				
			}
			
		}

	}


