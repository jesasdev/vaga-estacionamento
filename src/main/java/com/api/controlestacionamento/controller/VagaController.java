package com.api.controlestacionamento.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.controlestacionamento.dto.VagaDto;
import com.api.controlestacionamento.model.VagaModel;
import com.api.controlestacionamento.service.VagaService;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/vaga")
public class VagaController {
	
	final VagaService vagaService;
	public VagaController(VagaService vagaService) {
		this.vagaService=vagaService;
	}


	public ResponseEntity<Object> saveVaga(@RequestBody @Valid VagaDto vagaDto){
		var  vagaModel = new VagaModel();
		BeanUtils.copyProperties(vagaDto, vagaDto);
		vagaModel.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));
		return ResponseEntity.status(HttpStatus.CREATED).body(vagaService.save(vagaModel));
		
	}
}
