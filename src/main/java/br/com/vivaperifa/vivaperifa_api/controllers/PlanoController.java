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

import br.com.vivaperifa.vivaperifa_api.models.PlanoModel;
import br.com.vivaperifa.vivaperifa_api.repositories.PlanoRepository;

@RestController
@CrossOrigin(origins = "localhost:3000")
public class PlanoController {
    @Autowired
    PlanoRepository repository;

    @GetMapping("/plano/{codigo}")
    public ResponseEntity<PlanoModel> carregar(@PathVariable int codigo){
        Optional<PlanoModel> obj = repository.findById(codigo);
        return ResponseEntity.ok(obj.get());
    }

    @GetMapping("/planos")
    public ResponseEntity<List<PlanoModel>> listar(){
        List<PlanoModel> listagem = repository.findAll();
        return ResponseEntity.ok(listagem);
    }

    @PostMapping("/plano")
    public ResponseEntity<String> cadastrar(@RequestBody PlanoModel obj){
        repository.save(obj);
        String msg = "Registro salvo com sucesso";
        return ResponseEntity.ok(msg);
    }

    @PostMapping("/planos")
    public ResponseEntity<String> cadastrarLista(@RequestBody List<PlanoModel> listagem){
        for(PlanoModel obj : listagem){
            repository.save(obj);
        }
        String msg = "Lista salva com sucesso";
        return ResponseEntity.ok(msg);
    }
}
