package guru.springframework.petcliniclast.repositories;

import guru.springframework.petcliniclast.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
