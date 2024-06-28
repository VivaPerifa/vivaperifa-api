package br.com.vivaperifa.vivaperifa_api.controllers;

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

import br.com.vivaperifa.vivaperifa_api.models.OrganizadorModel;
import br.com.vivaperifa.vivaperifa_api.models.PessoaFisicaModel;
import br.com.vivaperifa.vivaperifa_api.models.PessoaJuridicaModel;
import br.com.vivaperifa.vivaperifa_api.repositories.OrganizadorRepository;
import br.com.vivaperifa.vivaperifa_api.repositories.PessoaFisicaRepository;
import br.com.vivaperifa.vivaperifa_api.repositories.PessoaJuridicaRepository;

@RestController
@CrossOrigin(origins="localhost:3000")
public class OrganizadorController {
    @Autowired
    PessoaFisicaRepository repositoryPessoaFisica;

    @Autowired
    PessoaJuridicaRepository repositoryPessoaJuridica;

    @Autowired
    OrganizadorRepository repositoryOrganizador;

    @GetMapping("/organizador/{codigo}")
    public ResponseEntity<OrganizadorModel> carregar(@PathVariable int codigo){
        Optional<OrganizadorModel> obj = repositoryOrganizador.findById(codigo);
        return ResponseEntity.ok(obj.get());
    }

    @GetMapping("/organizadores")
    public ResponseEntity<List<OrganizadorModel>> listar(){
        List<OrganizadorModel> listagem = repositoryOrganizador.findAll();
        return ResponseEntity.ok(listagem);
    }

    @PostMapping("/organizador/pessoafisica")
    public ResponseEntity<String> cadastrarPessoaFisica(@RequestBody PessoaFisicaModel obj){
        repositoryPessoaFisica.save(obj);
        String msg = "Registro salvo com sucesso";
        return ResponseEntity.ok(msg);
    }

    @PostMapping("/organizador/pessoajuridica")
    public ResponseEntity<String> cadastrarPessoaJuridica(@RequestBody PessoaJuridicaModel obj){
        repositoryPessoaJuridica.save(obj);
        String msg = "Registro salvo com sucesso";
        return ResponseEntity.ok(msg);
    }

    @PutMapping("/organizador/pessoafisica")
    public ResponseEntity<String> alterarPessoaFisica(@RequestBody PessoaFisicaModel obj){
        repositoryPessoaFisica.save(obj);
        String msg = "Registro salvo com sucesso";
        return ResponseEntity.ok(msg);
    }

    @PutMapping("/organizador/pessoajuridica")
    public ResponseEntity<String> alterarPessoaFisica(@RequestBody PessoaJuridicaModel obj){
        repositoryPessoaJuridica.save(obj);
        String msg = "Registro salvo com sucesso";
        return ResponseEntity.ok(msg);
    }
}
