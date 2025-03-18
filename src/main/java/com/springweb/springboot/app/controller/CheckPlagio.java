package com.springweb.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springweb.springboot.app.models.domain.RegistrarTexto;

import jakarta.validation.Valid;

@Controller
public class CheckPlagio {
	
	@GetMapping({"/verificar-plagio", "/verificar-plagio/"})
	public String verificarPlagio(RegistrarTexto texto, Model model) {
		model.addAttribute("texto", new RegistrarTexto());
		model.addAttribute("titulobar", "Detector de plagio");
		model.addAttribute("titulo", "Detector de plagio");
		model.addAttribute("textostring", "Pega tu texto:");
		model.addAttribute("archivostring", "Sube un archivo");
		return "/verificar-plagio/verificarplagio";
	}
	
	@PostMapping({"/verificar-plagio", "/verificar-plagio/"})
	public String resultadosPlagio(@Valid RegistrarTexto texto, BindingResult result, Model model) {
		model.addAttribute("titulobar", "Resultado");
		model.addAttribute("titulo", "Resultado del analisis de plagio");
		model.addAttribute("textostring", "Texto analizado:");
		model.addAttribute("archivostring", "Sube un archivo");
		model.addAttribute("resultadostring", "Resultado del analisis de plagio");
		model.addAttribute("porcentajestring", "Porcentaje plagiado");
		model.addAttribute("plagiostring", "Se ha detectado plagio de estos sitios web");
		if (result.hasErrors()) {
			return "/verificar-plagio/verificarplagio";
		}
		return "/verificar-plagio/resultados";
	}
}