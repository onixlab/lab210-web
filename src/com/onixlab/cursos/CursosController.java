package com.onixlab.cursos;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CursosController {
	
	
	@RequestMapping("cursoForm")
	public String formulario() {
		return "curso/formulario";
	}

	@RequestMapping("adicionaCurso")
	public String adiciona(@Valid Curso curso, BindingResult result) {
		if (result.hasErrors()) {
			return "curso/formulario";
		}

		JdbcCursoDao dao = new JdbcCursoDao();
		dao.adiciona(curso);
		return "curso/adicionado";
	}
	
	@RequestMapping("listaCursos")
	public ModelAndView lista() {
	  JdbcCursoDao dao = new JdbcCursoDao();
	  List<Curso> cursos = dao.lista(); 

	  ModelAndView mv = new ModelAndView("curso/lista");
	  mv.addObject("cursos", cursos);
	  return mv;
	}
}
