package pl.edu.pwsztar.movie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwsztar.movie.domain.MovieFacade;
import pl.edu.pwsztar.movie.dto.*;
import pl.edu.pwsztar.service.MovieService;

import java.util.List;

@Controller
@RequestMapping(value="/api")
public class MovieApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieApiController.class);


    private final MovieFacade movieFacade;

    public MovieApiController(MovieFacade movieFacade) {
        this.movieFacade = movieFacade;
    }



    @CrossOrigin
    @GetMapping(value = "/movies")
    public ResponseEntity<List<MovieDto>> getMovies() {
        LOGGER.info("find all movies");

        List<MovieDto> moviesDto = movieFacade.findAll();
        return new ResponseEntity<>(moviesDto, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(value = "/movies")
    public ResponseEntity<?> createMovie(@RequestBody CreateMovieDto createMovieDto) {
        LOGGER.info("create movie: {}", createMovieDto);
        movieFacade.creatMovie(createMovieDto);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin
    @DeleteMapping(value = "/movies/{movieId}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long movieId) {
        LOGGER.info("delete movie: {}", movieId);
        movieFacade.deleteMovie(movieId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/movies/{movieId}")
    public ResponseEntity<DetailsMovieDto> detailsMovie(@PathVariable Long movieId) {
        LOGGER.info("details movie: {}", movieId);
        DetailsMovieDto detailsMovieDto = movieFacade.findMovie(movieId);

        return new ResponseEntity<>(detailsMovieDto, HttpStatus.OK);
    }

    @CrossOrigin
    @PutMapping(value = "/movies/{movieId}")
    public ResponseEntity<Void> updateMovie(@RequestBody UpdateMovieDto updateMovieDto,
                                            @PathVariable Long movieId) {
        LOGGER.info("update movie: {}", movieId);
        movieFacade.updateMovie(movieId, updateMovieDto);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/movies/counter")
    public ResponseEntity<MovieCounterDto> countMovies() {
        LOGGER.info("count movies");

        MovieCounterDto movieCounterDto = movieFacade.countMovies();
        return new ResponseEntity<>(movieCounterDto, HttpStatus.OK);
    }

}
