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

import br.com.vivaperifa.vivaperifa_backend.models.PlanoModel;
import br.com.vivaperifa.vivaperifa_backend.repositories.PlanoRepository;

@RestController
@CrossOrigin(origins = "localhost:3000")
public class PlanoController {
    @Autowired
    PlanoRepository repository;

    @GetMapping("/plano/{id}")
    public ResponseEntity<PlanoModel> carregar(@PathVariable String id){
        Optional<PlanoModel> obj = repository.findById(id);
        return ResponseEntity.ok(obj.get());
    }

    @PostMapping("/plano")
    public ResponseEntity<String> cadastrar(@RequestBody PlanoModel obj){
        repository.save(obj);
        String msg = "Registro salvo com sucesso";
        return ResponseEntity.ok(msg);
    }
}
