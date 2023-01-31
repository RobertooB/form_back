package cecy.matriculacion.matriculacion.catalogue;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CatalogueRepository extends CrudRepository<Catalogue, Long> {

    List<Catalogue> findAll();

    List<Catalogue> findByValueLikeIgnoreCase(String term);
}
