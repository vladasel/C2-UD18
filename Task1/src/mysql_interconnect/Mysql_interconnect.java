package mysql_interconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql_interconnect {

	public void connect(String m_server, String m_port, String m_user, String m_password) {
		try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection m_connection = DriverManager.getConnection(
	        		"jdbc:mysql://" + m_server + ":" + m_port + "?useTimezone=true&serverTimezone=UTC",
	        		m_user, m_password);
	        System.out.println("Server Connected");
	
	    } catch (SQLException | ClassNotFoundException e) {
	        System.out.println("No se ha podido conectar con mi base de datos");
	        System.out.println(e);
	    }
	}
	
	//abrir conexion
	
	//cerrar conexion
	
	//crear bd
	
	//eliminar bd
	
	//crear tabla sin datos
	
	//crear tabla con datos
	
	//update tabla
	
	//update columna
	
	//eliminar columna
	
	//eliminar tabla
}
