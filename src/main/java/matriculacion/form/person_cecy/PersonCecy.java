package matriculacion.form.person_cecy;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import matriculacion.form.catalogue_cecy.CatalogueCecy;

@Data
@Entity
public class PersonCecy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String cedula;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String direccion;
    private String convencional;
    private String celular;
    private String email;
    private boolean aceptado;
    private long institucionId;
    @OneToOne()
    @JoinColumn(name = "catalogue_cecy_id", referencedColumnName = "id")
    private CatalogueCecy sexoId;
    @OneToOne()
    @JoinColumn(name = "catalogue_cecy_id", referencedColumnName = "id")
    private CatalogueCecy etniaId;
    
}
