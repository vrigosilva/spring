package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fiap.entidades.Curso;

@Controller
public class CursosController {
	
//	@RequestMapping("/curso/cadastro")
//	public String incluir(ModelMap model) {
//		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
//		JdbcEscolasDao dao_e = (JdbcEscolasDao) ctx.getBean("jdbcEscolasDAO");
//
//		try {
//			model.addAttribute("escolas", dao_e.listarEscolas());
//			return "cadastros/incluirCurso";
//		} catch (Exception e) {
//			model.addAttribute("erro", e.getMessage());
//			return "erro";
//		}
//	}

//	@RequestMapping(value = "/cadcurso", method = RequestMethod.POST)
	public String incluir(@RequestParam("idc") int idc, Curso curso, ModelMap model) {
		try {
//
//			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
//
//			JdbcEscolasDao dao_e = (JdbcEscolasDao) ctx.getBean("jdbcEscolasDAO");
//			curso.setEscola(dao_e.buscarEscola(idc));
//			JdbcCursosDao dao = (JdbcCursosDao) ctx.getBean("jdbcCursosDAO");
//			dao.incluirCurso(curso);
//
//			model.addAttribute("msg", "Curso " + curso.getDescricao() + "incluído");

			return "menu";
		} catch (Exception e) {
			model.addAttribute("msg", e.getMessage());
			return "menu";
		}
	}
	
	
	@RequestMapping(value = "/curso/listaCurso")
	public String listar(ModelMap model) {
		try {

//			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
//
//			JdbcCursosDao dao = (JdbcCursosDao) ctx.getBean("jdbcCursosDAO");
//			List<Curso> cursos = dao.listarCursos();
//
//			model.addAttribute("cursos", cursos);

			return "listaCurso";
		} catch (Exception e) {
			model.addAttribute("msg", e.getMessage());
			return "menu";
		}
	}
	
	@RequestMapping(value = "/curso/CarregaListaCursoEscola")
	public String listarPorCurso(ModelMap model) {
		try {
//			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
//			JdbcEscolasDao dao_e = (JdbcEscolasDao) ctx.getBean("jdbcEscolasDAO");
//			model.addAttribute("escolas", dao_e.listarEscolas());
			return "listaCurso";
		} catch (Exception e) {
			model.addAttribute("msg", e.getMessage());
			return "menu";
		}
	}
	
	@RequestMapping(value = "/curso/listaCursoEscola")
	public String listarPorCurso(@RequestParam("escolaId")Integer escolaId, ModelMap model) {
		try {

//			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
//			JdbcCursosDao dao = (JdbcCursosDao) ctx.getBean("jdbcCursosDAO");
//			JdbcEscolasDao dao_e = (JdbcEscolasDao) ctx.getBean("jdbcEscolasDAO");
//
//			List<Curso> cursos = dao.listarCursosPorEscola(escolaId);
//			model.addAttribute("cursos", cursos);
//			model.addAttribute("escolas", dao_e.listarEscolas());
//			model.addAttribute("escolaId", escolaId);
//			
			return "listaCurso";
		} catch (Exception e) {
			model.addAttribute("msg", e.getMessage());
			return "menu";
		}
	}
}
