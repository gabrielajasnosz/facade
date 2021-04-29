//package pl.edu.pwsztar.movie.dto;
//
//import org.springframework.stereotype.Component;
//import pl.edu.pwsztar.movie.domain.Movie;
//
//@Component
//public class MovieDetailsMapper implements Converter<DetailsMovieDto, Movie> {
//
//    @Override
//    public DetailsMovieDto convert(Movie movie) {
//        return new DetailsMovieDto.Builder()
//                .title(movie.getTitle())
//                .videoId(movie.getVideoId())
//                .image(movie.getImage())
//                .year(movie.getYear())
//                .build();
//    }
//}
