package com.teste.main.repository;

import com.teste.main.model.UsuarioModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<UsuarioModel, String> {

}