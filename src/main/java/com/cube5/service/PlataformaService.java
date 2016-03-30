package com.cube5.service;

import java.util.List;

import com.cube5.model.Plataforma;

public interface PlataformaService {
    
    Plataforma getPlataformaById(String plataformaId);
    
    List<Plataforma> getPlataformas();
}
