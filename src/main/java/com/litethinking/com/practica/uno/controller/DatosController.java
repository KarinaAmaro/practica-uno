package com.litethinking.com.practica.uno.controller;

import com.litethinking.com.practica.uno.domain.DatosTO;
import com.litethinking.com.practica.uno.service.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatosController {

    private final DatosService datosService;

    @Autowired
    public DatosController(DatosService datosService) {
        this.datosService = datosService;
    }

    @PostMapping("/inicio")
    public @ResponseBody DatosTO bienvenida(@RequestBody DatosTO datosTO) {
        return datosService.bienvenida(datosTO);
    }
}
