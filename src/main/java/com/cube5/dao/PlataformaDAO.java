package com.cube5.dao;

import java.util.List;

import com.cube5.model.Plataforma;

public interface PlataformaDAO {
    
    void init();
    
    Plataforma getPlataformaById(String plataformaId);
    
    List<Plataforma> getPlataformas();
}
