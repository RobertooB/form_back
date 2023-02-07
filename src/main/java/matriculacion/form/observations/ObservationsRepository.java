package matriculacion.form.observations;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ObservationsRepository extends CrudRepository<Observations, Long> {
    public List<Observations> findAll();
}
