package com.cube5.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cube5.dao.PlataformaDAO;
import com.cube5.model.Plataforma;
import com.cube5.service.PlataformaService;

@Service("plataformaService")
public class PlataformaServiceImpl implements PlataformaService {
    
    private static final Logger log = LoggerFactory.getLogger(PlataformaServiceImpl.class);
    
    @Autowired
    private PlataformaDAO plataformaDao;
    
    public Plataforma getPlataformaById(String plataformaId) {
        return null;
    }
    
    public List<Plataforma> getPlataformas() {
        return plataformaDao.getPlataformas();
    }

        
}
