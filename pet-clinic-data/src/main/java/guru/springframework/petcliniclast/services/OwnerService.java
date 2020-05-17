package guru.springframework.petcliniclast.services;

import guru.springframework.petcliniclast.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
