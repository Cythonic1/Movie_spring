package move.com.move.movie;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//! This is a testing class
@Configuration
public class MovieConfig {

    @Bean
    CommandLineRunner commandLineRunner (MovieRepository movieRepository) {
        return args -> {
            Movie Batman = new Movie(
                    "The Batman",
                    "Christopher Nolan",
                    "2h 32m",
                    "Action"
            );
            Movie Joker = new Movie(
                    "Joker",
                    "Todd Phillips",
                    "2h 2m",
                    "Drama"
            );
            movieRepository.saveAll(List.of(Batman, Joker));
            
    };
}
}
