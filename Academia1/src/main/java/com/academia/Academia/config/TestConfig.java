package com.academia.Academia.config;

import com.academia.Academia.entities.Exercicios;
import com.academia.Academia.entities.User;
import com.academia.Academia.repositories.ExerciciosRepository;
import com.academia.Academia.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;


@Configuration
@Profile("test")
public class  TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ExerciciosRepository exerciciosRepository;



    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Kayo Rabelo", "kayo_rabelo.uk@hotmail.com", "071992006060", "123456");

        Exercicios e1 = new Exercicios ("Cadeira extensora",null,u1);
        Exercicios e2 = new Exercicios ("Mesa Flexora",null,u2);
        Exercicios e3 = new Exercicios ("Triceps Barra",null,u2);




        userRepository.saveAll(Arrays.asList(u1,u2));
        exerciciosRepository.saveAll(Arrays.asList(e1,e2,e3));
    }






}
