package com.example.controle;

import com.example.controle.service.ComputerManagerAction;
import com.example.controle.service.dtos.ComputerDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;


@SpringBootApplication
public class ControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ComputerManagerAction computerManagerServiceImp) {
        return args -> {
            Stream.of("pc1", "pc2", "pc3").forEach(name -> {
                ComputerDTO computer = new ComputerDTO();
                computer.setPrice(name);
                computerManagerServiceImp.saveComputer(computer);
            });

        };
    };
}