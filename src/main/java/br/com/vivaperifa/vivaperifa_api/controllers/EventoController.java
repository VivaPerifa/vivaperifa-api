package br.com.vivaperifa.vivaperifa_api.controllers;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import br.com.vivaperifa.vivaperifa_api.models.EventoModel;
import br.com.vivaperifa.vivaperifa_api.repositories.EventoRepository;

@RestController
@CrossOrigin(origins = "localhost:3000")
public class EventoController {
    @Autowired
    EventoRepository repository;

    @GetMapping("/evento/{codigo}")
    public ResponseEntity<EventoModel> carregar(@PathVariable int codigo){
        Optional<EventoModel> obj = repository.findById(codigo);
        return ResponseEntity.ok(obj.get());
    }

    @GetMapping("/eventos")
    public ResponseEntity<List<EventoModel>> listar(){
        List<EventoModel> listagem = repository.findAll();
        return ResponseEntity.ok(listagem);
    }

    @PostMapping("/evento")
    public ResponseEntity<String> cadastrar(@RequestBody EventoModel obj){
        repository.save(obj);
        String msg = "Registro salvo com sucesso";
        return ResponseEntity.ok(msg);
    }

    @PutMapping("/evento")
    public ResponseEntity<String> alterar(@RequestBody EventoModel obj){
        repository.save(obj);
        String msg = "Registro alterado com sucesso";
        return ResponseEntity.ok(msg);
    }
}

