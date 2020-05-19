package guru.springframework.petcliniclast.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> specialitySet = new HashSet<>();

    public Set<Speciality> getSpeciality() {
        return specialitySet;
    }

    public void setSpeciality(Set<Speciality> specialitySet) {
        this.specialitySet = specialitySet;
    }
}
