package br.com.vivaperifa.vivaperifa_backend.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vivaperifa.vivaperifa_backend.models.CategoriaModel;
import br.com.vivaperifa.vivaperifa_backend.repositories.CategoriaRepository;

@RestController
@CrossOrigin(origins="localhost:3000")
public class CategoriaController {
    @Autowired
    CategoriaRepository repository;

    @GetMapping("/categoria/{id}")
    public ResponseEntity<CategoriaModel> carregar(@PathVariable String id){
        Optional<CategoriaModel> obj = repository.findById(id);
        return ResponseEntity.ok(obj.get());
    }

    @PostMapping("/categoria")
    public ResponseEntity<String> cadastrar(@RequestBody CategoriaModel obj){
        repository.save(obj);
        String msg = "Registro salvo com sucesso";
        return ResponseEntity.ok(msg);
    }
}
