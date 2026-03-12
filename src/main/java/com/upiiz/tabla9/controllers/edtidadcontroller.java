package com.upiiz.tabla9.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class edtidadcontroller {
    @GetMapping("/crear")
    public String crear(){return "crear";}
    @GetMapping("/eliminar")
    public String eliminar(){return "eliminar";}
    @GetMapping("/editar")
    public String editar(){return "editar";}
    @GetMapping("/lista")
    public String lista(){return "lista";}
}
