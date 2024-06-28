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

import br.com.vivaperifa.vivaperifa_api.models.CategoriaModel;
import br.com.vivaperifa.vivaperifa_api.repositories.CategoriaRepository;

@RestController
@CrossOrigin(origins="localhost:3000")
public class CategoriaController {
    @Autowired
    CategoriaRepository repository;

    @GetMapping("/categoria/{codigo}")
    public ResponseEntity<CategoriaModel> carregar(@PathVariable int codigo){
        Optional<CategoriaModel> obj = repository.findById(codigo);
        return ResponseEntity.ok(obj.get());
    }

    @GetMapping("/categorias")
    public ResponseEntity<List<CategoriaModel>> listar(){
        List<CategoriaModel> listagem = repository.findAll();
        return ResponseEntity.ok(listagem);
    }

    @PostMapping("/categoria")
    public ResponseEntity<String> cadastrar(@RequestBody CategoriaModel obj){
        repository.save(obj);
        String msg = "Registro salvo com sucesso";
        return ResponseEntity.ok(msg);
    }

    @PostMapping("/categorias")
    public ResponseEntity<String> cadastrarLista(@RequestBody List<CategoriaModel> listagem){
        for(CategoriaModel obj : listagem){
            repository.save(obj);
        }
        String msg = "Lista salva com sucesso";
        return ResponseEntity.ok(msg);
    }
}
