package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fiap.entidades.Escola;

@Controller
public class EscolasController {

	@RequestMapping("/escola/cadastro")
	public String incluir() {
		return "cadastros/incluirEscola";
	}

	@RequestMapping(value = "/cadescola", method = RequestMethod.POST)
	public String incluir(Escola escola, ModelMap model) {
		try {
//
//			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
//			JdbcEscolasDao dao = (JdbcEscolasDao) ctx.getBean("jdbcEscolasDAO");
//			dao.incluirEscola(escola);
//
//			model.addAttribute("msg", "Escola " + escola.getDescricao() + "incluída");

			return "menu";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			model.addAttribute("erro", e.getMessage());
			return "erro";
		}
	}
	
	@RequestMapping(value = "/escola/listaEscola")
	public String listar(ModelMap model) {
		try {

//			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
//			JdbcEscolasDao dao = (JdbcEscolasDao) ctx.getBean("jdbcEscolasDAO");
//			List<Escola> escolas = dao.listarEscolas();
//
//			model.addAttribute("escolas", escolas);

			return "listaEscola";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			model.addAttribute("erro", e.getMessage());
			return "erro";
		}
	}
}
