package pl.edu.pwsztar.movie.domain;
import org.springframework.context.annotation.Bean;

public class MovieConfiguration {

    @Bean
    MovieFacade movieFacade(MovieRepository movieRepository) {
        MovieCreator movieCreator = new MovieCreator();
        return new MovieFacade(movieRepository, movieCreator);
    }
}
