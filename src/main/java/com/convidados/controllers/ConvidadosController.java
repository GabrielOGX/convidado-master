package com.convidados.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/convidados")
@Controller
public class ConvidadosController {
    @GetMapping("/listar")
    public ModelAndView listar(){
        //cria o objeto mv e insere uma lista de ocnvidados
        ModelAndView mv = new ModelAndView("ListaConvidados");
        //envia um objeto convidado para o mv
        mv.addObject(new Convidado());
        //envia uma lista "convidados" da tabela convidados
        mv.addObject("convidados", convidadosRepository.findAll());
        return mv;
    }
}
