package pl.edu.pwsztar.movie.dto;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class MovieCounterDto {

    private long counter;


}
