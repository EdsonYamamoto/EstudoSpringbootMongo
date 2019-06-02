package com.teste.main;

import com.teste.main.model.PersonModel;
import com.teste.main.repository.PersonRepository;
import com.teste.main.repository.UsuarioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import org.springframework.beans.factory.annotation.Autowired;
@SpringBootApplication
public class ProjetoTesteApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProjetoTesteApplication.class, args);

    }

}
