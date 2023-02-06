package matriculacion.form.api_institution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/institucion")
public class InstitutionController {

    @Autowired
    InstitutionClient institutionClient;

    @GetMapping("/{id}/")
    public InstitutionDTO findById(@PathVariable Long id) {
        return institutionClient.findInstitutionByIdDto(id);
    }

}
