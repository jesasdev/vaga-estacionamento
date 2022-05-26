package com.api.controlestacionamento.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.controlestacionamento.service.VagaService;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/vaga")
public class VagaController {
	
	final VagaService vagaService;
	public VagaController(VagaService vagaService) {
		this.vagaService=vagaService;
	}

	
}
