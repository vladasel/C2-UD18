package Task9;

import mysql_interconnect.Mysql_interconnect;

public class Task9App {

	public static void main(String[] args) {
		Mysql_interconnect my_conection = new Mysql_interconnect();
		my_conection.connect("192.168.5.104", "3306", "remote", "27ione91");
		my_conection.createDB("ud18_9");
		my_conection.useDB("ud18_9");
		
		my_conection.createTable("");
		my_conection.createTable("");
		my_conection.createTable("");
		my_conection.createTable("");
		
		my_conection.insertRecord("");
		my_conection.insertRecord("");
		my_conection.insertRecord("");
		my_conection.insertRecord("");
		
	}

}
