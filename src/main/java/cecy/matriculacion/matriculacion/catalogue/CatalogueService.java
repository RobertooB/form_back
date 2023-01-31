package cecy.matriculacion.matriculacion.catalogue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * RolService
 */
@Service
public class CatalogueService {
    @Autowired
    CatalogueRepository rolRepository;

    public Catalogue save(Catalogue rol) {
        return rolRepository.save(rol);
    }

    public Catalogue findById(long id) {
        return rolRepository.findById(id).orElse(new Catalogue());
    }

    public Catalogue update(Catalogue rol) {
        return rolRepository.save(rol);
    }

    public void deleteRol(long id) {
        rolRepository.deleteById(id);
    }

    public List<Catalogue> findAll() {
        return rolRepository.findAll();
    }

    public List<Catalogue> findByValue(String term) {
        return rolRepository.findByValueLikeIgnoreCase(term + "%");
    }

}