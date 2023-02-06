package matriculacion.form.api_person.catalogue;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CatalogueRepository extends CrudRepository<Catalogue, Long> {
    public List<Catalogue> findAll();
}
