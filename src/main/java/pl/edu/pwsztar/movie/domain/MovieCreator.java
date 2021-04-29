package pl.edu.pwsztar.movie.domain;

import pl.edu.pwsztar.movie.dto.CreateMovieDto;
import pl.edu.pwsztar.movie.dto.MovieDto;
import pl.edu.pwsztar.movie.dto.UpdateMovieDto;

import static java.util.Objects.requireNonNull;

public class MovieCreator {

    Movie fromMovieDto(MovieDto movieDto) {
        requireNonNull(movieDto);
        return Movie.builder()
                .movieId(movieDto.getMovieId())
                .title(movieDto.getTitle())
                .image(movieDto.getImage())
                .videoId(movieDto.getVideoId())
                .year(movieDto.getYear())
                .build();
    }

    Movie fromCreateMovieDto(CreateMovieDto createMovieDto) {
        requireNonNull(createMovieDto);
        return Movie.builder()
                .title(createMovieDto.getTitle())
                .image(createMovieDto.getImage())
                .videoId(createMovieDto.getVideoId())
                .year(createMovieDto.getYear())
                .build();
    }
//
//    Movie fromUpdateMovieDto(Long movieId,UpdateMovieDto updateMovieDto) {
//        requireNonNull(updateMovieDto);
//        return Movie.builder()
//                .movieId(movieId)
//                .title(updateMovieDto.getTitle())
//                .image(updateMovieDto.getImage())
//                .videoId(updateMovieDto.getVideoId())
//                .year(updateMovieDto.getYear())
//                .build();
//    }

}