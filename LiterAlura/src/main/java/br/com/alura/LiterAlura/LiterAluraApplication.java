package br.com.alura.LiterAlura;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
        SpringApplication.run(LiterAluraApplication.class, args);
    }


	@Override
	public void run(String... args) {
		System.out.println("LiterAlura");
	}



}
