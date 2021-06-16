package com.nix.example.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nix.example.jpa.entity.StudentEntity;
import com.nix.example.jpa.entity.repository.StudentRepository;

@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaExampleApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			repository.save(new StudentEntity("nishkarsh", "goel", "nishkarsh@nix.com", 30));
		};
	}

}

