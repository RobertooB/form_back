package matriculacion.form.api_person;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "bff.customer", url = "http://localhost:8000/api/persona")
public interface PersonClient {
    @GetMapping("/{id}/")
    PersonDTO findPersonByDTOId(@PathVariable("id") Long id);

    @GetMapping("/cedula/{cedula}/")
    PersonDTO findPersonByDTOCedula(@PathVariable("id") String cedula);
}
