package com.conversor.a3.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conversor.a3.model.TaxasCambio;

public interface TaxasCambioRepository extends JpaRepository <TaxasCambio, Integer>{
    Optional<TaxasCambio> findByConversaoId(Integer conversaoId);
}
