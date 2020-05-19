package guru.springframework.petcliniclast.repositories;

import guru.springframework.petcliniclast.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
