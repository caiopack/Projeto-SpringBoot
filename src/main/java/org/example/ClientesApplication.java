package org.example;

import org.example.model.entity.Cliente;
import org.example.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication{

    //O autowired tambem pode ser fora do metodo
    // porém como só vamos utilizar no autowired a injeção é melhor deixar no metodo
    //@Bean
    //public CommandLineRunner run( @Autowired ClienteRepository repository ){
        //return args -> {
           // Cliente cliente = Cliente.builder().cpf("11111111111").nome("Fulano").build();
          //  repository.save(cliente);
        //};
   // }
    //Básico para uma aplicação springboot
    public static void main(String[] args){
        SpringApplication.run(ClientesApplication.class, args);
    }
}