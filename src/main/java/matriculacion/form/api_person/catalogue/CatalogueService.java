package matriculacion.form.api_person.catalogue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogueService {
    @Autowired
    CatalogueRepository catalogueRepository;

    public Catalogue save(Catalogue entity) {
        return catalogueRepository.save(entity);
    }

    public List<Catalogue> findAll() {
        return catalogueRepository.findAll();
    }

    public Catalogue findById(Long id) {
        return catalogueRepository.findById(id).orElse(new Catalogue());
    }

}
