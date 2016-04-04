package com.cube5.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.cube5.dao.PlataformaDAO;
import com.cube5.model.Plataforma;

@Component("plataformaDao")
public class PlataformaDAOImpl implements PlataformaDAO {
    
    private static final Logger log = LoggerFactory.getLogger(PlataformaDAOImpl.class);
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public void init() {
        log.debug("creando tabla plataforma...");
        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS plataforma(PLATAFORMAID VARCHAR(35))");
        
        jdbcTemplate.update("INSERT INTO plataforma values (?)", "JAVA");
        jdbcTemplate.update("INSERT INTO plataforma values (?)", "UNIX");
        jdbcTemplate.update("INSERT INTO plataforma values (?)", "MAC_OSX");
    }
    
    public Plataforma getPlataformaById(String plataformaId) {
        return null;
    }
    
    public List<Plataforma> getPlataformas() {
        log.debug("consultando plataformas...");
        
        List<Plataforma> plataformas = jdbcTemplate.query(
        "select * from plataforma",
        new RowMapper<Plataforma>() {
            public Plataforma mapRow(ResultSet rs, int rowNum) throws SQLException {
                Plataforma plataforma = new Plataforma(rs.getString(1));
                return plataforma;
            }
        });
        log.debug("plataformas: {}", plataformas.toString());
        return plataformas;
    }
}
