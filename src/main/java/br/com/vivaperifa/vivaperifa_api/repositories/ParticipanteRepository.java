package br.com.vivaperifa.vivaperifa_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import br.com.vivaperifa.vivaperifa_api.models.ParticipanteModel;

@Repository
public interface ParticipanteRepository extends JpaRepository<ParticipanteModel, Integer>, JpaSpecificationExecutor<ParticipanteModel>{

}