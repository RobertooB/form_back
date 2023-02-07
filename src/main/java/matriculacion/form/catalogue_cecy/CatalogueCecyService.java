package matriculacion.form.catalogue_cecy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogueCecyService {
    @Autowired
    CatalogueCecyRepository catalogueCecyRepository;

    public CatalogueCecy save(CatalogueCecy entity) {
        return catalogueCecyRepository.save(entity);
    }

    public List<CatalogueCecy> findAll() {
        return catalogueCecyRepository.findAll();
    }

    public CatalogueCecy findById(Long id) {
        return catalogueCecyRepository.findById(id).orElse(new CatalogueCecy());
    }
}

