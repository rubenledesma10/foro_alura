package com.example.foroAlura.controller;

import com.example.foroAlura.model.Topicos;
import com.example.foroAlura.service.ITopicosService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicoController {

    @Autowired
    ITopicosService topicoService;

    @PostMapping("/topicos")
    public String saveTopico(@RequestBody @Valid Topicos topico) {
        topicoService.saveTopico(topico);
        return "Topico creado";
    }

    @GetMapping("/topicos")
    public List<Topicos> getTopicos() {
        return topicoService.getTopicos();
    }

    @GetMapping("/topicos/{id}")
    public Topicos unTopico(@PathVariable Long id) {
        return topicoService.findTopicos(id);
    }

    @PutMapping("/topicos")
    public Topicos editarTopico(@RequestBody @Valid Topicos topico){
        topicoService.editarTopico(topico);
        return topicoService.findTopicos(topico.getId());
    }
    
    @DeleteMapping("/topicos/{id}")
    public String deleteTopico(@PathVariable Long id){
        topicoService.deleteTopico(id);
        return "Topico eliminado";
    }
    
}
