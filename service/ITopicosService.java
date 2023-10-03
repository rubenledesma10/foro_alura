package com.example.foroAlura.service;

import com.example.foroAlura.model.Topicos;
import java.util.List;

public interface ITopicosService {
    
    public void saveTopico(Topicos topico);
    
    public List<Topicos> getTopicos();
    
    public Topicos findTopicos(Long id);
    
    public void editarTopico(Topicos topico);
    
    public void deleteTopico(Long id);
    
}
