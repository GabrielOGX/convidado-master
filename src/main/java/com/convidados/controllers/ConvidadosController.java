package com.convidados.controllers;

import com.convidados.model.Convidado;
import com.convidados.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvidadosController {
    @Autowired //para não precisar criar um objeto
    private ConvidadoRepository convidadoRepository;
    @GetMapping("/convidados")
    public ModelAndView listar(){
        //cria o objeto mv e insere uma lista de ocnvidados
        ModelAndView mv = new ModelAndView("ListaConvidados");
        //envia um objeto convidado para o mv
        mv.addObject(new Convidado());
        //envia uma lista "convidados" da tabela convidados
        mv.addObject("convidados", convidadoRepository.findAll());
        return mv;
    }
}
