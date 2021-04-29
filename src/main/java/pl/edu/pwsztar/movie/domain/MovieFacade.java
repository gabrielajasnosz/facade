package pl.edu.pwsztar.movie.domain;

import pl.edu.pwsztar.movie.dto.*;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;

public class MovieFacade {
    private final MovieRepository movieRepository;
    private final MovieCreator movieCreator;

    public MovieFacade(MovieRepository movieRepository, MovieCreator movieCreator) {
        this.movieRepository = movieRepository;
        this.movieCreator = movieCreator;
    }

    public List<MovieDto> findAll() {
        return movieRepository
                .findByOrderByYearDesc().stream()
                .map(Movie::dto)
                .collect(Collectors.toList());
    }


    public void creatMovie(CreateMovieDto createMovieDto) {
        requireNonNull(createMovieDto);
        Movie movie = movieCreator.fromCreateMovieDto(createMovieDto);
        movieRepository.save(movie);
    }

    public void deleteMovie(Long movieId) {
        movieRepository.deleteById(movieId);
    }


    public DetailsMovieDto findMovie(Long movieId) {
        requireNonNull(movieId);
        Movie movie = movieRepository.findOneByMovieId(movieId);
        return movie.detailsDto();
    }


    public MovieCounterDto countMovies() {
        return new MovieCounterDto..counter(movieRepository.count()).build();
    }

    public void updateMovie(Long movieId, UpdateMovieDto updateMovieDto) {
        requireNonNull(updateMovieDto);
        requireNonNull(movieId);
        Movie movie = movieRepository.findOneByMovieId(movieId);


            movieRepository.save(movie.toBuilder().title(updateMovieDto.getTitle()).image(updateMovieDto.getImage()).videoId(updateMovieDto.getVideoId()).year(updateMovieDto.getYear()).build());
        }
    }


}
