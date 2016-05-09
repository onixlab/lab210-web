package com.onixlab.cursos.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.onixlab.cursos.Curso;

public class AdicionaCurso {
	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setNome("Curso JPA e Hibernate");
		curso.setCargaHoraria(16d);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cursos");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(curso);
		manager.getTransaction().commit();

		System.out.println("ID do curso: " + curso.getId());

		manager.close();
	}
}
