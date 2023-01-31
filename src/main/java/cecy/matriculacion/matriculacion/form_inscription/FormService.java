package cecy.matriculacion.matriculacion.form_inscription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {
    
    @Autowired
    FormRepository formRepository;

    public Form save(Form form){
        return formRepository.save(form);
    }
    
}
