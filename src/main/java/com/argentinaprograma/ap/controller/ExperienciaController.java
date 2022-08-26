package com.argentinaprograma.ap.controller;

import com.argentinaprograma.ap.models.Educacion;
import com.argentinaprograma.ap.models.Experiencia;
import com.argentinaprograma.ap.services.EducacionServices;
import com.argentinaprograma.ap.services.ExperienciaServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {
    private final ExperienciaServices experienciaServices;

    public ExperienciaController(ExperienciaServices experienciaServices) {
        this.experienciaServices = experienciaServices;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> obtenerExperiencia(){
        List<Experiencia> experiencia=experienciaServices.buscarExperiencia();
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Experiencia> editarExperincia(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia=experienciaServices.editarExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia){
        Experiencia nuevaExperiencia=experienciaServices.addExperiencia(experiencia);
        return new ResponseEntity<>(nuevaExperiencia,HttpStatus.CREATED);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("id") Long id){
        experienciaServices.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
