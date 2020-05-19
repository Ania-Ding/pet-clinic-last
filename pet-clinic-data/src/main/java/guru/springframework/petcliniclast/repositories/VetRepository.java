package guru.springframework.petcliniclast.repositories;

import guru.springframework.petcliniclast.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
