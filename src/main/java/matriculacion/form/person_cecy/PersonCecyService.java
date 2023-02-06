package matriculacion.form.person_cecy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonCecyService {
    @Autowired
    PersonCecyRepository personCecyRepository;

    public PersonCecy save(PersonCecy form) {
        return personCecyRepository.save(form);
    }

    public List<PersonCecy> findAll() {
        return personCecyRepository.findAll();
    }

    public PersonCecy findById(Long id) {
        return personCecyRepository.findById(id).orElse(new PersonCecy());
    }
}
