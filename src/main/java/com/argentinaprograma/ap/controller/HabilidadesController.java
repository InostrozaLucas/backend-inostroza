package com.argentinaprograma.ap.controller;

import com.argentinaprograma.ap.models.Experiencia;
import com.argentinaprograma.ap.models.Habilidades;
import com.argentinaprograma.ap.services.ExperienciaServices;
import com.argentinaprograma.ap.services.HabilidadesServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "https://login-lucasinostroza.web.app/")
@RequestMapping("/habilidades")
public class HabilidadesController {
    private final HabilidadesServices habilidadesServices;

    public HabilidadesController(HabilidadesServices habilidadesServices) {
        this.habilidadesServices = habilidadesServices;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Habilidades>> obtenerHabilidades(){
        List<Habilidades> habilidades=habilidadesServices.buscarHabilidades();
        return new ResponseEntity<>(habilidades, HttpStatus.OK);
    }
    @PutMapping("/update/)
    public ResponseEntity<Habilidades> editarHabilidades(@RequestBody Habilidades habilidades){
        Habilidades updateHabilidades=habilidadesServices.editarHabilidades(habilidades);
        return new ResponseEntity<>(updateHabilidades,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Habilidades> crearHabilidades(@RequestBody Habilidades habilidades){
        Habilidades nuevaHabilidades=habilidadesServices.addHabilidades(habilidades);
        return new ResponseEntity<>(nuevaHabilidades,HttpStatus.CREATED);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarHabilidades(@PathVariable("id") Long id){
        habilidadesServices.borrarHabilidades(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
