package pl.edu.pwsztar.movie.dto;

@FunctionalInterface
public interface Converter<T, F> {
    T convert(F from);
}
