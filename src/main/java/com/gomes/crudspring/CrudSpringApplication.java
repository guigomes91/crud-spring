package com.gomes.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gomes.crudspring.model.Course;
import com.gomes.crudspring.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository repository) {
		return args -> {
			repository.deleteAll();
			Course c = new Course();
			c.setName("Angular");
			c.setCategory("Front-end");
			c.setStatus("Ativo");
			repository.save(c);

			c = new Course();
			c.setName("Spring");
			c.setCategory("Back-end");
			c.setStatus("Ativo");
			repository.save(c);
		};
	}

}
