package matriculacion.form.catalogue_cecy;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CatalogueCecyRepository extends CrudRepository<CatalogueCecy, Long> {
    public List<CatalogueCecy> findAll();
}
