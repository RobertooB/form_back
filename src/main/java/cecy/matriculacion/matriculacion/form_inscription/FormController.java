package cecy.matriculacion.matriculacion.form_inscription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/formInscripcion")
@CrossOrigin({ "*" })
public class FormController {
    @Autowired
    FormService formService;

    @PostMapping("/save")
    public Form save(@RequestBody Form form){
        return formService.save(form);
    }   

}
