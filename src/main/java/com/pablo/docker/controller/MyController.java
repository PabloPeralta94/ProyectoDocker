package com.pablo.docker.controller;

import com.pablo.docker.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    Service miServicio;

        @GetMapping("/cifrar")
        public String cifrar(@RequestParam String texto, @RequestParam int desplazamiento) {
            return miServicio.cifrarTexto(texto, desplazamiento);
        }

        @GetMapping("/descifrar")
        public String descifrar(@RequestParam String texto, @RequestParam int desplazamiento) {
            return miServicio.descifrarTexto(texto, desplazamiento);
        }
    }

