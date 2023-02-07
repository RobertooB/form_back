package matriculacion.form.documents;

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
@RequestMapping("api/documents")
@CrossOrigin({ "*" })
public class DocumentsController {

    @Autowired
    DocumentsService documentsService;

    @GetMapping("/")
    public List<Documents> findAll() {
        return documentsService.findAll();
    }

    @GetMapping("/{id}/")
    public Documents findById(@PathVariable Long id) {
        return documentsService.findById(id);
    }

    @PostMapping("/")
    public Documents save(@RequestBody Documents documents) {
        return documentsService.save(documents);
    }
}
