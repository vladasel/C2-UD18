package Task4;

import mysql_interconnect.Mysql_interconnect;

public class Task4App {

	public static void main(String[] args) {
		Mysql_interconnect connection = new Mysql_interconnect();
		connection.connect("192.168.1.150", "3306", "root", "marccudi4");
		connection.createDB("Ud18_Ej4");
		connection.createTable("create table peliculas(codigo int, nombre varchar(100), calificacion_edad"
				+ " int, primary key (codigo));");
		
		connection.createTable("create table salas(codigo int, nombre varchar(100), pelicula int, primary "
				+ "key (codigo),foreign key (pelicula) references pelicula (codigo));");
		
	}

}
