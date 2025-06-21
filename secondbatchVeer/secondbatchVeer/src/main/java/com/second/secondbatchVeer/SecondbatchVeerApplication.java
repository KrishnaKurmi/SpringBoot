package com.second.secondbatchVeer;

import com.second.secondbatchVeer.movie.MovieRepository;
import com.second.secondbatchVeer.movie.Movies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecondbatchVeerApplication {

	public static void main(String[] args) {

		SpringApplication.run(SecondbatchVeerApplication.class, args);
//		ConfigurableApplicationContext context=SpringApplication.run(SecondbatchVeerApplication.class, args);
//		MovieRepository movieRepository = context.getBean(MovieRepository.class);
//		Movies movies =new Movies();
//		movies.setMovieid(1);
//		movies.setMoviename("Housefull 5");
//		movies.setGenre("Bakwaas");
//		movieRepository.save(movies);
//		System.out.println("Movie Saved!");
	}

}
