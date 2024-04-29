package com.litethinking.com.practica.uno.service;

import com.litethinking.com.practica.uno.domain.DatosTO;
import org.springframework.stereotype.Service;

@Service
public class DatosService {

    public DatosTO bienvenida(DatosTO str) {
        String temp = "Hola "+ str.string() + ", bienveido a Spring Boot.";
        return new DatosTO( temp );
    }
}
