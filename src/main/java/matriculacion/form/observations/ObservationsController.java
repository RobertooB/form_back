package matriculacion.form.observations;

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
@RequestMapping("api/observations")
@CrossOrigin({ "*" })
public class ObservationsController {

    @Autowired
    ObservationsService observationsService;

    @GetMapping("/")
    public List<Observations> findAll() {
        return observationsService.findAll();
    }

    @GetMapping("/{id}/")
    public Observations findById(@PathVariable Long id) {
        return observationsService.findById(id);
    }

    @PostMapping("/")
    public Observations save(@RequestBody Observations observations) {
        return observationsService.save(observations);
    }
}
