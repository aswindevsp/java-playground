import javax.swing.*;

class Login{
	Login() {
		JFrame f = new JFrame("Login");
		
		JLabel l1 = new JLabel("Email: ");
		JLabel l2 = new JLabel("Password: ");
		l1.setBounds(20, 20, 80, 30);
		l2.setBounds(20, 75, 80, 30);
		
		JTextField email = new JTextField();				
		JPasswordField password = new JPasswordField();
		
		email.setBounds(100,20,100,30);
		password.setBounds(100,75,100,30);
		
		JButton b = new JButton("Login");
		b.setBounds(100, 120, 80, 30);
		
		f.add(l1);
		f.add(l2);
		f.add(email);
		f.add(password);
		f.add(b);
		
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);	
	}	
}

class GUILogIn {
	public static void main(String []args) {
		new Login();
	}
}
