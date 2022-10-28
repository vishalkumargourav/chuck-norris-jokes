package vkg.springframework.chucknorrisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vkg.springframework.chucknorrisjokes.services.JokesService;

@SpringBootApplication
public class ChuckNorrisJokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisJokesApplication.class, args);
	}

}
