package br.com.vivaperifa.vivaperifa_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import br.com.vivaperifa.vivaperifa_api.models.PessoaFisicaModel;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisicaModel, Integer>, JpaSpecificationExecutor<PessoaFisicaModel>{
    
}
