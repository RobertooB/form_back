package matriculacion.form.person_cecy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/personCecy")
@CrossOrigin({ "*" })
public class PersonCecyController {
    @Autowired
    PersonCecyService personCecyService;

    @PostMapping("/")
    public PersonCecy save(@RequestBody PersonCecy form) {
        return personCecyService.save(form);
    }

    @GetMapping("/")
    public List<PersonCecy> findAll() {
        return personCecyService.findAll();
    }

    @GetMapping("/{id}")
    public PersonCecy findById(@PathVariable Long id) {
        return personCecyService.findById(id);
    }

    @PutMapping("/{id}/")
    public PersonCecy update(@RequestBody PersonCecy entity) {
        return personCecyService.save(entity);
    }
}
