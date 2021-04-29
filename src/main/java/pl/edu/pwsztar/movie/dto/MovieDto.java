package pl.edu.pwsztar.movie.dto;

import lombok.*;

import java.io.Serializable;
@Builder(toBuilder = true)
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class MovieDto implements Serializable {

    private Long movieId;
    private String videoId;
    private String title;
    private String image;
    private Integer year;


}
