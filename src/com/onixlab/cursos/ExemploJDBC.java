package com.onixlab.cursos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExemploJDBC {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lab210", "root", "");
			System.out.println("Conectou");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
