package br.com.vivaperifa.vivaperifa_backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.vivaperifa.vivaperifa_backend.models.CategoriaModel;

public interface CategoriaRepository extends MongoRepository<CategoriaModel, String>{
    
}
