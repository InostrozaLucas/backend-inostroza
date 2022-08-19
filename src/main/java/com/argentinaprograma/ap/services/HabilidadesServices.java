package com.argentinaprograma.ap.services;

import com.argentinaprograma.ap.models.Habilidades;
import com.argentinaprograma.ap.repository.HabilidadesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class HabilidadesServices {
    private final HabilidadesRepo habilidadesRepo;

    @Autowired
    public HabilidadesServices(HabilidadesRepo habilidadesRepo) {
        this.habilidadesRepo = habilidadesRepo;
    }

    public Habilidades addHabilidades(Habilidades habilidades){
        return habilidadesRepo.save(habilidades);
    }
    public List<Habilidades> buscarHabilidades(){
        return habilidadesRepo.findAll();
    }
    public Habilidades editarHabilidades(Habilidades habilidades){
        return habilidadesRepo.save(habilidades);
    }

    public void borrarHabilidades(Long id) {
        habilidadesRepo.deleteById(id);
    }

}
