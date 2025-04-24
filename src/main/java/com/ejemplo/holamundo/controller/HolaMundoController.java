package com.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "¡HOLA MUNDO!";
    }

    @GetMapping("/saludo/{nombre_usuario}")
    public String saludo(@PathVariable String nombre_usuario){
        return "Hola "+nombre_usuario;
    }

    @GetMapping("/suma/{valor_uno}/{valor_dos}")
    public String suma(@PathVariable int valor_uno, @PathVariable int valor_dos){
        return "Resultado: "+ (valor_uno + valor_dos);
    }

    @GetMapping("/resta/{valor_uno}/{valor_dos}")
    public String resta(@PathVariable int valor_uno, @PathVariable int valor_dos){
        return "Resultado: "+ (valor_uno - valor_dos);
    }

    @GetMapping("/multiplicacion/{valor_uno}/{valor_dos}")
    public String multiplicacion(@PathVariable int valor_uno, @PathVariable int valor_dos){
        return "Resultado: "+ (valor_uno * valor_dos);
    }

    @GetMapping("/division/{valor_uno}/{valor_dos}")
    public String division(@PathVariable int valor_uno, @PathVariable int valor_dos){
        return "Resultado: "+ (valor_uno / valor_dos);
    }

    @GetMapping("/listaproducto/{l}")
    public String producto(@PathVariable String l){
        List<String> productos = new ArrayList<>();
        productos.add("a");
        productos.add("b");
        productos.add("c");

        if(productos.contains(l)){
            return "!Producto Encontrado!:";
        }else{
            return "Producto no encontrado - Error 404";
        }
    }



}
