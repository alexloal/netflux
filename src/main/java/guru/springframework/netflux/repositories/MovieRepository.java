package guru.springframework.netflux.repositories;

import guru.springframework.netflux.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author alejandrolopez
 */
public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}
