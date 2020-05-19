package guru.springframework.petcliniclast.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)  //FetchType.EAGER is load everything at once
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialitySet = new HashSet<>();

    public Set<Speciality> getSpeciality() {
        return specialitySet;
    }

    public void setSpeciality(Set<Speciality> specialitySet) {
        this.specialitySet = specialitySet;
    }
}
