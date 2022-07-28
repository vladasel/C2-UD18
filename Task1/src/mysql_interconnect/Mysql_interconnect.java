package mysql_interconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class Mysql_interconnect {

	Connection m_connection;

	// abrir conexion
	public void connect(String m_server, String m_port, String m_user, String m_password) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			m_connection = DriverManager.getConnection(
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
			String query = "CREATE DATABASE " + name + ";";
			Statement at = m_connection.createStatement();
			at.executeUpdate(query);
			JOptionPane.showMessageDialog(null, "se a creado la base de datos " + name + " exitosamente");
		} catch (SQLException ex) {
			Logger.getLogger(Mysql_interconnect.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	//eliminar bd
	
	//crear tabla sin datos
	public void createTable(String m_database, String m_name) {
		try {
			String m_db_usage_query = "USE " + m_database + ";";
			Statement m_select_db = m_connection.createStatement();
			m_select_db.executeUpdate(m_db_usage_query);
			String m_db_create_table_query = "CREATE TABLE " + m_name + " ( prueba INT PRIMARY KEY );";
			Statement m_create_table = m_connection.createStatement();
			m_create_table.executeUpdate(m_db_create_table_query);
			System.out.println("Tabla creada con éxito!");
		} catch (SQLException m_exception) {
			System.out.println(m_exception.getMessage());
			System.out.println("Error creando table.");
		}
	}
	
	//crear tabla con datos
	
	//update tabla
	
	//update columna
	
	//eliminar columna
	
	//eliminar tabla
}
