package com.onixlab.cursos.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onixlab.cursos.Curso;

public class BuscaCursos {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cursos");
		EntityManager manager = factory.createEntityManager();

		// use o import javax.persistence.Query
		Query query = manager.createQuery("select c from Curso as c " + "where c.cargaHoraria > :paramCargaHoraria");
		query.setParameter("paramCargaHoraria", 1d);

		List<Curso> lista = query.getResultList();

		for (Curso curso : lista) {
			System.out.println(curso.getNome());
		}

		manager.close();
	}

}
