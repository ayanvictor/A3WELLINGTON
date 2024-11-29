package com.conversor.a3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conversor.a3.model.Conversao;

public interface ConversaoRepository extends JpaRepository <Conversao, Integer>{

    List<Conversao> findByOrigemIdAndDestinoId (Integer origemId, Integer destinoId);
}
