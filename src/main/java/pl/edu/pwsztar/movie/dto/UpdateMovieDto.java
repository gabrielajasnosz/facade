package pl.edu.pwsztar.movie.dto;


import lombok.*;

@Builder(toBuilder = true)
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class UpdateMovieDto {
    private String title;
    private String image;
    private Integer year;
    private String videoId;

}
