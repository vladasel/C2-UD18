package Task1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import mysql_interconnect.Mysql_interconnect;

public class Task1App {

	public static void main(String[] args) {
		Mysql_interconnect m_conection = new Mysql_interconnect();
		
		String m_host = JOptionPane.showInputDialog("Type the hostname");
		String m_port = JOptionPane.showInputDialog("Type the port");
		String m_user = JOptionPane.showInputDialog("Type " + m_host + "'s username");
		
		JFrame m_frame = new JFrame();
		JPasswordField m_pwdfld = new JPasswordField();
		m_pwdfld.setEchoChar('*');
		m_pwdfld.setColumns(32);

        JOptionPane.showConfirmDialog(m_frame, m_pwdfld, "Type " + m_user + "'s password", JOptionPane.OK_CANCEL_OPTION );

		JOptionPane.showMessageDialog(null, "Connecting to " + m_host + ":" +
				m_port + " -> " + m_user + "@" + String.valueOf(m_pwdfld.getPassword()));
		       
		m_conection.connect(m_host, m_port, m_user, String.valueOf(m_pwdfld.getPassword()));

	}

}
