package com.conversor.a3.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.conversor.a3.service.CurrencyConversionService;

@RestController
@RequestMapping("/api/conversao")
public class CurrencyConversionController {

    private final CurrencyConversionService conversaoService;

    public CurrencyConversionController(CurrencyConversionService conversaoService) {
        this.conversaoService = conversaoService;
    }


    @RequestMapping("/taxas")
    public ResponseEntity<Double>getTaxa(
        @RequestParam Integer origemId,
        @RequestParam Integer destinoId) {
        Double taxa = conversaoService.getTaxaCambio(origemId, destinoId);

        return ResponseEntity.ok(taxa);
    }
}
