package matriculacion.form.person_cecy;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

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
    private long sexoId;
    
}
