package Task7;

import mysql_interconnect.Mysql_interconnect;

public class Task7App {

	public static void main(String[] args) {
		Mysql_interconnect my_conection = new Mysql_interconnect();
		my_conection.connect("192.168.5.104", "3306", "remote", "27ione91");
		my_conection.createDB("ud18_7");
		my_conection.useDB("ud18_7");

		my_conection.createTable("create table cientificos(" + "DNI varchar(8)," + "nom_apell varchar(255),"
				+ "primary key(DNI)" + ");");

		my_conection.createTable("create table proyectos();");

		my_conection.createTable("create table asignado_a();");
	}

}
