package pl.edu.pwsztar.movie.dto;


import lombok.*;

@Builder(toBuilder = true)
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class DetailsMovieDto {
    private String title;
    private String videoId;
    private String image;
    private Integer year;


}
