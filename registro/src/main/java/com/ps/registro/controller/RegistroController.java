package com.ps.registro.controller;

import com.ps.registro.modelo.Registro;
import com.ps.registro.services.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registro")
public class RegistroController {
    @Autowired
    RegistroService registroService;

        @GetMapping("/{id}")
        public ResponseEntity<Registro> consultar ( @PathVariable("id") int id) {
            try {
                Registro registro = new Registro();
                registro.setId(id);
                return ResponseEntity.ok(registro);
            } catch (Exception e) {
                return ResponseEntity.badRequest().build();
            }
        }
        @PostMapping("/")
        public ResponseEntity<Registro> guardar(@RequestBody Registro registro) {
            try {
                registroService.guardar(registro);
                return ResponseEntity.ok(registro);
            }catch (Exception e) {
                return ResponseEntity.badRequest().build();
            }
        }
        @PutMapping("/")
        public ResponseEntity<Registro> actualizar (@RequestBody Registro registro){
            try {
                return ResponseEntity.ok(registro);
            }catch (Exception e) {
                return ResponseEntity.badRequest().build();
            }
    }
        @DeleteMapping("/{id}")
        public ResponseEntity<Registro> borrar(@PathVariable("id") int id){
            try {
                Registro Registro = new Registro();
                Registro.setId(id);
                return ResponseEntity.ok(Registro);
            }catch (Exception e) {
                return ResponseEntity.badRequest().build();
            }
    }

    }
