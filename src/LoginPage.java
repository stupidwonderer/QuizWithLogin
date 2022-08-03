import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class LoginPage implements ActionListener {
    JFrame frame= new JFrame();
    JButton loginbutton= new JButton("login");
    JButton resetbutton= new JButton("reset");
    JTextField idField= new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel messagelabel = new JLabel("");
    JLabel idLabel= new JLabel("UserId");
    JLabel passwordLabel= new JLabel("Password");
    
    
    HashMap<String,String> logininfo= new HashMap<String,String>();
    
    LoginPage(HashMap<String,String> Originallogin){
        logininfo=Originallogin;
        idLabel.setBounds(50,100,75,25);
        passwordLabel.setBounds(50,150,75,25);
        messagelabel.setBounds(125, 250, 250, 35);
        messagelabel.setFont(new Font(null,Font.ITALIC,25));
        idField.setBounds(125, 100, 200, 25);
        passwordField.setBounds(125, 150, 200, 25);
        loginbutton.setBounds(125, 200, 100, 25);
        loginbutton.addActionListener(this);
        resetbutton.setBounds(225, 200, 100, 25);
        resetbutton.addActionListener(this);
        
        frame.add(idLabel);
        frame.add(passwordLabel);
        frame.add(messagelabel);
        frame.add(idField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginbutton);
        frame.add(resetbutton);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==resetbutton) {
        	idField.setText("");
        	passwordField.setText("");
        }
        if(e.getSource()==loginbutton) {
        	String userID=idField.getText();
        	String password=String.valueOf(passwordField.getPassword());
        	
        	if(logininfo.containsKey(userID)) {
        		if(logininfo.get(userID).equals(password)) {
        			messagelabel.setForeground(Color.green);
        			messagelabel.setText("LOGIN SUCCESFULL");
        			WelcomePage welcomepage= new WelcomePage(userID);
        			frame.setVisible(false);
        			
        		}
        		else {
        			messagelabel.setForeground(Color.red);
        			messagelabel.setText("WRONG PASSWORD");
        		}
        	}
        	else {
        		messagelabel.setForeground(Color.red);
    			messagelabel.setText("INVALID LOGIN");
        	}
        }
    }
}
