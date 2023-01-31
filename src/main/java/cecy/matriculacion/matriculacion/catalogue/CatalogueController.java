package cecy.matriculacion.matriculacion.catalogue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * RolController
 */
@RestController
@RequestMapping("/api/catalogue")
@CrossOrigin({ "*" })
public class CatalogueController {
    @Autowired
    CatalogueService catalogueService;

    @PostMapping("/save")
    public Catalogue save(@RequestBody Catalogue catalogue) {
        return catalogueService.save(catalogue);
    }

    @GetMapping("/{id}")
    public Catalogue findById(@PathVariable long id) {
        return catalogueService.findById(id);
    }
    // update

    @PutMapping("/update")
    public Catalogue update(@RequestBody Catalogue catalogue) {
        return catalogueService.update(catalogue);
    }
    // delete

    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        catalogueService.deleteRol(id);
    }

    // get all roles

    @GetMapping("/findAll")
    public List<Catalogue> findAll() {
        return catalogueService.findAll();
    }

    @GetMapping("findByValue/{term}")
    public List<Catalogue> findByValue(@PathVariable String term) {
        return catalogueService.findByValue(term);
    }

}