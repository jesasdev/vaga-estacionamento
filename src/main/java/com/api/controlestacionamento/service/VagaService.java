package com.api.controlestacionamento.service;

import org.springframework.stereotype.Service;

import com.api.controlestacionamento.model.VagaModel;
import com.api.controlestacionamento.repository.VagaRepository;

@Service
public class VagaService {
	

	final VagaRepository vagaRepository ;
	public VagaService(VagaRepository vagaRepository) {
		this.vagaRepository=vagaRepository;
	}
	public VagaModel save(VagaModel vagaModel) {
		
		return vagaRepository.save(vagaModel);
	}

}
