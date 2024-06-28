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

import br.com.vivaperifa.vivaperifa_api.models.PessoaFisicaModel;
import br.com.vivaperifa.vivaperifa_api.repositories.PessoaFisicaRepository;

@RestController
@CrossOrigin(origins = "localhost:3000")
public class PessoaFisicaController {
    @Autowired
    PessoaFisicaRepository repository;

    @GetMapping("/pessoafisica/{codigo}")
    public ResponseEntity<PessoaFisicaModel> carregar(@PathVariable int codigo){
        Optional<PessoaFisicaModel> obj = repository.findById(codigo);
        return ResponseEntity.ok(obj.get());
    }

    @GetMapping("/pessoafisica/lista")
    public ResponseEntity<List<PessoaFisicaModel>> listar(){
        List<PessoaFisicaModel> listagem = repository.findAll();
        return ResponseEntity.ok(listagem);
    }

    @PostMapping("/pessoafisica")
    public ResponseEntity<String> cadastrar(@RequestBody PessoaFisicaModel obj){
        repository.save(obj);
        String msg = "Registro salvo com sucesso";
        return ResponseEntity.ok(msg);
    }
}
