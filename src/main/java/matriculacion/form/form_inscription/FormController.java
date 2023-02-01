package matriculacion.form.form_inscription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/formInscripcion")
@CrossOrigin({ "*" })
public class FormController {
    @Autowired
    FormService formService;

    @PostMapping("/save")
    public FormInscription save(@RequestBody FormInscription form) {
        return formService.save(form);
    }

    @GetMapping("/findAll")
    public List<FormInscription> findAll() {
        return formService.findAll();
    }

    @GetMapping("/{id}")
    public FormInscription findById(@PathVariable Long id) {
        return formService.findById(id);
    }
}
