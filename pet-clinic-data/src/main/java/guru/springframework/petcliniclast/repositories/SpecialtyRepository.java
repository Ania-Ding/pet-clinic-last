package guru.springframework.petcliniclast.repositories;

import guru.springframework.petcliniclast.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
