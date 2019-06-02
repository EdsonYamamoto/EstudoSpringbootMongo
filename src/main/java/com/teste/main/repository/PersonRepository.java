package com.teste.main.repository;

import com.teste.main.model.PersonModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<PersonModel, String> {

}