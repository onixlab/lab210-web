package com.onixlab.cursos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcCursoDao {

	Connection con;

	public JdbcCursoDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab210?useSSL=false", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void adiciona(Curso curso) {
		try {
			PreparedStatement pstm = con.prepareStatement("insert into cursos(nome, cargahoraria) values(?,?)");
			pstm.setString(1, curso.getNome());
			pstm.setDouble(2, curso.getCargaHoraria());
			pstm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Curso> lista() {
		List<Curso> cursos = new ArrayList<>();
		try {
			PreparedStatement pstm = con.prepareStatement("select * from cursos");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				String nome = rs.getString("nome");
				Double cargaHoraria = rs.getDouble("cargahoraria");
				Curso curso = new Curso();
				curso.setNome(nome);
				curso.setCargaHoraria(cargaHoraria);
				cursos.add(curso);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cursos;
	}

}
