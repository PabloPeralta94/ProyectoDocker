package com.pablo.docker.service;
@org.springframework.stereotype.Service

public class Service {

    public String cifrarTexto(String texto, int desplazamiento) {
        StringBuilder textoCifrado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - base + desplazamiento) % 26 + base);
            }
            textoCifrado.append(c);
        }
        return textoCifrado.toString();
    }

    public String descifrarTexto(String texto, int desplazamiento) {
        return cifrarTexto(texto, 26 - (desplazamiento % 26));
    }
}