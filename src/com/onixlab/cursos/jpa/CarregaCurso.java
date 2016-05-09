package com.onixlab.cursos.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.onixlab.cursos.Curso;

public class CarregaCurso {
	  public static void main(String[] args) {

		    EntityManagerFactory factory = Persistence.
		        createEntityManagerFactory("cursos");
		    EntityManager manager = factory.createEntityManager();

		    Curso encontrado = manager.find(Curso.class, 1L);
		    System.out.println(encontrado.getNome());    

		    manager.close();
		  }
}
