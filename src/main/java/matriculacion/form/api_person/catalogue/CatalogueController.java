package matriculacion.form.api_person.catalogue;

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
@RequestMapping("api/catalogue")
@CrossOrigin({ "*" })
public class CatalogueController {

    @Autowired
    CatalogueService catalogueService;

    @GetMapping("/")
    public List<Catalogue> findAll() {
        return catalogueService.findAll();
    }

    @GetMapping("/{id}/")
    public Catalogue findById(@PathVariable Long id) {
        return catalogueService.findById(id);
    }

    @PostMapping("/")
    public Catalogue save(@RequestBody Catalogue catalogue) {
        return catalogueService.save(catalogue);
    }

}
