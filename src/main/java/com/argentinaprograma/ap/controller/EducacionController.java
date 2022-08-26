package com.argentinaprograma.ap.controller;

import com.argentinaprograma.ap.models.Educacion;
import com.argentinaprograma.ap.services.EducacionServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/educacion")
public class EducacionController {
    private final EducacionServices educacionServices;

    public EducacionController(EducacionServices educacionServices) {
        this.educacionServices = educacionServices;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> obtenerEducacion(){
        List<Educacion> educacion=educacionServices.buscarEducacion();
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion=educacionServices.editarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
        Educacion nuevaEducacion=educacionServices.addEducacion(educacion);
        return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
        educacionServices.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
