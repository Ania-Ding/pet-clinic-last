package guru.springframework.petcliniclast.repositories;

import guru.springframework.petcliniclast.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
