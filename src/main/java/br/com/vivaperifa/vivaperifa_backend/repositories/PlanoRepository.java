package br.com.vivaperifa.vivaperifa_backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.vivaperifa.vivaperifa_backend.models.PlanoModel;

public interface PlanoRepository extends MongoRepository<PlanoModel, String>{
    
}
