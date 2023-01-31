package cecy.matriculacion.matriculacion.form_inscription;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FormRepository extends CrudRepository<Form, Long> {
    List<Form> findAll();  
}
