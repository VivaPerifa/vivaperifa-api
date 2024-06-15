package br.com.vivaperifa.vivaperifa_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.vivaperifa.vivaperifa_api.models.EventoModel;

public interface EventoRepository extends JpaRepository<EventoModel, Integer>, JpaSpecificationExecutor<EventoModel>{
   
   
}
