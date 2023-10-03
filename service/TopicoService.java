
package com.example.foroAlura.service;

import com.example.foroAlura.model.Topicos;
import com.example.foroAlura.repository.ITopicos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicoService implements ITopicosService {
    
    @Autowired
    private ITopicos topicoRepo;

    @Override
    public void saveTopico(Topicos topico) {
        topicoRepo.save(topico);
    }

    @Override
    public List<Topicos> getTopicos() {
        return topicoRepo.findAll();
    }

    @Override
    public Topicos findTopicos(Long id) {
        return topicoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarTopico(Topicos topico) {
        this.saveTopico(topico);
    }

    @Override
    public void deleteTopico(Long id) {
        topicoRepo.deleteById(id);
    }




    
}
