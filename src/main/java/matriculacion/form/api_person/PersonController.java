package matriculacion.form.api_person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/persona")
public class PersonController {

    @Autowired
    PersonClient personClient;

    @GetMapping("/{id}/")
    public PersonDTO findById(@PathVariable Long id) {
        return personClient.findPersonByDTOId(id);
    }

    @GetMapping("/cedula/{cedula}/")
    public PersonDTO findByCedula(@PathVariable String cedula) {
        return personClient.findPersonByDTOCedula(cedula);
    }

}
