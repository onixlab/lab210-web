package com.onixlab.cursos;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
