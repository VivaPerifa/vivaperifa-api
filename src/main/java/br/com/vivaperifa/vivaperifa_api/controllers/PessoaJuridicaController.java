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

import br.com.vivaperifa.vivaperifa_api.models.PessoaJuridicaModel;
import br.com.vivaperifa.vivaperifa_api.repositories.PessoaJuridicaRepository;

@RestController
@CrossOrigin(origins = "localhost:3000")
public class PessoaJuridicaController {
    @Autowired
    PessoaJuridicaRepository repository;

    @GetMapping("/pessoajuridica/{codigo}")
    public ResponseEntity<PessoaJuridicaModel> carregar(@PathVariable int codigo){
        Optional<PessoaJuridicaModel> obj = repository.findById(codigo);
        return ResponseEntity.ok(obj.get());
    }

    @GetMapping("/pessoajuridica/lista")
    public ResponseEntity<List<PessoaJuridicaModel>> listar(){
        List<PessoaJuridicaModel> listagem = repository.findAll();
        return ResponseEntity.ok(listagem);
    }

    @PostMapping("/pessoajuridica")
    public ResponseEntity<String> cadastrar(@RequestBody PessoaJuridicaModel obj){
        repository.save(obj);
        String msg = "Registro salvo com sucesso";
        return ResponseEntity.ok(msg);
    }
}
