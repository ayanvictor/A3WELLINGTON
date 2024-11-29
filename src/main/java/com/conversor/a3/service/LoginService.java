package com.conversor.a3.service;

import com.conversor.a3.model.Pessoas;
import com.conversor.a3.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    private final PessoaRepository pessoaRepository;

    public LoginService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public boolean autenticar(String email, String password) {
        Optional<Pessoas> pessoa = pessoaRepository.findByEmailAndPassword(email, password);
        return pessoa.isPresent();
    }
}
