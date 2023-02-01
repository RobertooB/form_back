package matriculacion.form.form_inscription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {
    @Autowired
    FormInscriptionRepository formRepository;

    public FormInscription save(FormInscription form) {
        return formRepository.save(form);
    }

    public List<FormInscription> findAll() {
        return formRepository.findAll();
    }

    public FormInscription findById(Long id) {
        return formRepository.findById(id).orElse(new FormInscription());
    }
}
