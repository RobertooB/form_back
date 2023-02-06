package matriculacion.form.person_cecy;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonCecyRepository extends CrudRepository<PersonCecy, Long> {
    public List<PersonCecy> findAll();
    public PersonCecy findByCedula(String term);
}

