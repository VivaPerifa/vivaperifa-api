package br.com.vivaperifa.vivaperifa_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import br.com.vivaperifa.vivaperifa_api.models.PessoaFisicaModel;
import br.com.vivaperifa.vivaperifa_api.models.PessoaJuridicaModel;

public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridicaModel, Integer>, JpaSpecificationExecutor<PessoaFisicaModel>{
    
}
