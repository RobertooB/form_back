package matriculacion.form.catalogue_cecy;

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
@RequestMapping("api/catalogueCecy")
@CrossOrigin({ "*" })
public class CatalogueCecyController {

    @Autowired
    CatalogueCecyService catalogueCecyService;

    @GetMapping("/")
    public List<CatalogueCecy> findAll() {
        return catalogueCecyService.findAll();
    }

    @GetMapping("/{id}/")
    public CatalogueCecy findById(@PathVariable Long id) {
        return catalogueCecyService.findById(id);
    }

    @PostMapping("/")
    public CatalogueCecy save(@RequestBody CatalogueCecy catalogueCecy) {
        return catalogueCecyService.save(catalogueCecy);
    }

}

