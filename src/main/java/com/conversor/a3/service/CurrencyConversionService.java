package com.conversor.a3.service;

import org.springframework.stereotype.Service;

import com.conversor.a3.model.TaxasCambio;
import com.conversor.a3.repository.ConversaoRepository;
import com.conversor.a3.repository.TaxasCambioRepository;
@Service
public class CurrencyConversionService {

    private final ConversaoRepository conversaoRepository;
    private final TaxasCambioRepository taxasCambioRepository;

    public CurrencyConversionService(ConversaoRepository conversaoRepository, TaxasCambioRepository taxasCambioRepository) {
        this.conversaoRepository = conversaoRepository;
        this.taxasCambioRepository = taxasCambioRepository;
    }

    public Double getTaxaCambio(Integer origemId, Integer destinoId) {
        // Buscar o ID de conversão com base na origem e destino
        var conversao = conversaoRepository.findByOrigemIdAndDestinoId(origemId, destinoId)
                .stream()
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Conversão não encontrada para os IDs fornecidos."));

        // Buscar a taxa de câmbio mais recente usando o ID da conversão
        TaxasCambio taxa = taxasCambioRepository.findByConversaoId(conversao.getId())
                .orElseThrow(() -> new IllegalArgumentException("Nenhuma taxa de câmbio encontrada para hoje."));

        return taxa.getTaxa();
    }
}