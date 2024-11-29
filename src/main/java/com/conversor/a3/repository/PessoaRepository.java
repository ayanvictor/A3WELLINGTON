package com.conversor.a3.repository;

import com.conversor.a3.model.Pessoas;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoas, Integer> {
    Optional<Pessoas> findByEmailAndPassword(String email, String password);
}
