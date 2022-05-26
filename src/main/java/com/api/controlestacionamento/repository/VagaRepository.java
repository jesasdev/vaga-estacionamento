package com.api.controlestacionamento.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.controlestacionamento.model.VagaModel;

@Repository
public interface VagaRepository extends JpaRepository<VagaModel, UUID> {

}
