package pl.edu.pwsztar.movie.dto;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class MovieCounterDto {

    private final long counter=0;


}
