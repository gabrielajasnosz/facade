//package pl.edu.pwsztar.movie.dto;
//
//import org.springframework.stereotype.Component;
//import pl.edu.pwsztar.movie.domain.Movie;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class MovieListMapper implements Converter<List<MovieDto>, List<Movie>> {
//
//    @Override
//    public List<MovieDto> convert(List<Movie> movies) {
//        List<MovieDto> moviesDto = new ArrayList<>();
//
//        for(Movie movie: movies) {
//            MovieDto movieDto = new MovieDto.Builder()
//                    .movieId(movie.getMovieId())
//                    .title(movie.getTitle())
//                    .image(movie.getImage())
//                    .year(movie.getYear())
//                    .build();
//
//            moviesDto.add(movieDto);
//        }
//
//        return moviesDto;
//    }
//}
