package matriculacion.form.observations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObservationsService {
    @Autowired
    ObservationsRepository observationsRepository;

    public Observations save(Observations entity) {
        return observationsRepository.save(entity);
    }

    public List<Observations> findAll() {
        return observationsRepository.findAll();
    }

    public Observations findById(Long id) {
        return observationsRepository.findById(id).orElse(new Observations());
    }
}
