package matriculacion.form.api_institution;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "bff.institution", url = "http://localhost:8000/api/institucion")
public interface InstitutionClient {
    @GetMapping("/{id}/")
    InstitutionDTO findInstitutionByIdDto(@PathVariable("id") Long id);
}
