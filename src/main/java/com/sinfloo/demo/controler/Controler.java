package com.sinfloo.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinfloo.demo.interfaceservice.IpersonaService;
import com.sinfloo.demo.modelo.Persona;

@Controller
@RequestMapping
public class Controler {	
	
	@Autowired
	private IpersonaService service;
	
	@GetMapping("/listar")
	public String listar(Model model){
		List<Persona>personas =service.listar();
		model.addAttribute("persona", personas);
		return "index";
	}
}
