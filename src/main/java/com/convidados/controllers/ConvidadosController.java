package com.convidados.controllers;
import com.convidados.model.Convidado;
import com.convidados.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvidadosController {
    @Autowired //para não precisar criar um objeto
    private ConvidadoRepository convidadoRepository;
    //localhost:8080/convidados
    @GetMapping("/convidados")
    public ModelAndView listar(){
        //cria o objeto mv e insere uma lista de convidados
        ModelAndView mv = new ModelAndView("ListaConvidados");
        //envia um objeto convidado para o mv
        mv.addObject(new Convidado());
        //envia uma lista "convidados" da tabela convidados
        mv.addObject("convidados",
                convidadoRepository.findAll());
        return mv;
    }

    @PostMapping("/convidados")
    public String salvar(Convidado convidado){
        //chamado o metodo save do repository e passa o obj convidado
        this.convidadoRepository.save(convidado);
        //atualizar a pagina do front para exibir os dados
        //redirect faz um get em /convidados
        return "redirect:/convidados";
    }
}