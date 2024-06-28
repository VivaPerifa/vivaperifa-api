package br.com.vivaperifa.vivaperifa_api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vivaperifa.vivaperifa_api.models.ParticipanteModel;
import br.com.vivaperifa.vivaperifa_api.repositories.ParticipanteRepository;

@RestController
@CrossOrigin(origins="localhost:3000")
public class ParticipanteController {
    
    @Autowired
    ParticipanteRepository repository;

    // @GetMapping("/participante/{nomeUsuario}")
    // public ResponseEntity<ParticipanteModel> carregar(@PathVariable String nomeUsuario){
    //     ParticipanteModel obj = repository.carregar(nomeUsuario);
    //     return ResponseEntity.ok(obj);
    // }

    @GetMapping("/participantes/{codigo}")
    public ResponseEntity<ParticipanteModel> carregar(@PathVariable int codigo){
        Optional<ParticipanteModel> obj = repository.findById(codigo);
        return ResponseEntity.ok(obj.get());
    }

    @GetMapping("/participantes")
    public ResponseEntity<List<ParticipanteModel>> listar(){
        List<ParticipanteModel> listagem = repository.findAll();
        return ResponseEntity.ok(listagem);
    }

    @PostMapping("/participante")
    public ResponseEntity<String> cadastrar(@RequestBody ParticipanteModel obj){
        repository.save(obj);
        String msg = "Registro salvo com sucesso";
        return ResponseEntity.ok(msg);
    }
    
}

