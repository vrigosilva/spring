package br.com.fiap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.entidades.Usuario;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioDao dao;
	
	@RequestMapping("/usuario/addForm")
	public String form(Usuario usuario) {
		System.out.println("form");
		return "usuario/addForm";
	}
					 
	@RequestMapping(value="/usuario/add")
	public String add(Usuario usuario, BindingResult br, RedirectAttributes red) {
		br.getFieldErrors().forEach(System.out::println);
		dao.persist(usuario);
		red.addFlashAttribute("msg", "Usu�rio inclu�do com sucesso!");
		return "redirect:/usuario/list";
	}

	@RequestMapping("/usuario/list")
	public String list(ModelMap map) {
		List<Usuario> usuarios = dao.findAll();
		map.addAttribute("usuarios", usuarios);
		return "/usuario/lista";
	}}
