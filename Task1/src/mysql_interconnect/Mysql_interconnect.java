package mysql_interconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Mysql_interconnect {

	Connection m_connection;

	// abrir conexion
	public void connect(String m_server, String m_port, String m_user, String m_password) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection m_connection = DriverManager.getConnection(
					"jdbc:mysql://" + m_server + ":" + m_port + "?useTimezone=true&serverTimezone=UTC", m_user,
					m_password);
			System.out.println("Server Connected");

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("No se ha podido conectar con mi base de datos");
			System.out.println(e);
		}
	}

	// cerrar conexion
	public void closeConnection() {
		try {
			m_connection.close();
			JOptionPane.showMessageDialog(null, "Se ha finalizado la conexión con el servidor");
		} catch (SQLException ex) {
			Logger.getLogger(Mysql_interconnect.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	// crear bd
	public void createDB(String name) {
		try {
			String query = "CREATE DATABASE " + name;
			Statement at = Conexion.createStatement();
			at.executeUpdate(query);
			closeConnection();
			MySQLConnection("root", "", name);
			JOptionPane.showMessageDialog(null, "se a creado la base de datos " + name + " exitosamente");
		} catch (SQLExceptioin ex) {
			Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	// eliminar bd

	// crear tabla sin datos

	// crear tabla con datos

	// update tabla

	// update columna

	// eliminar columna

	// eliminar tabla

}
