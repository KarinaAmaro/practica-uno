package com.litethinking.com.practica.uno.service;

import com.litethinking.com.practica.uno.domain.DatosTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class DatosServiceTest {

    @InjectMocks
    DatosService dtoService;

    @BeforeEach
    void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testDatos() {

        String test= "kate";
        String expected = "Hola kate, bienvenido a Spring Boot.";
        String result = dtoService.bienvenida(new DatosTO(test)).string();

        assert result.contains(test);
    }
}
