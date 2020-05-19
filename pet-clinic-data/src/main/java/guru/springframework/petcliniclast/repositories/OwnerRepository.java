package guru.springframework.petcliniclast.repositories;

import guru.springframework.petcliniclast.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findBylastName(String lastName);
}
