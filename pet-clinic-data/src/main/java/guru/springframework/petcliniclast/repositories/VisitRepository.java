package guru.springframework.petcliniclast.repositories;

import guru.springframework.petcliniclast.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
