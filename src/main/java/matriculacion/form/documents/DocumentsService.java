package matriculacion.form.documents;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentsService {
    @Autowired
    DocumentsRepository documentsRepository;

    public Documents save(Documents entity) {
        return documentsRepository.save(entity);
    }

    public List<Documents> findAll() {
        return documentsRepository.findAll();
    }

    public Documents findById(Long id) {
        return documentsRepository.findById(id).orElse(new Documents());
    }
}
