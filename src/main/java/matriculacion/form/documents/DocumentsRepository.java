package matriculacion.form.documents;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DocumentsRepository extends CrudRepository<Documents, Long> {
    public List<Documents> findAll();
}
