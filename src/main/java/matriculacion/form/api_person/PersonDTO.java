package matriculacion.form.api_person;

import java.sql.Date;

import lombok.Data;

@Data
public class PersonDTO {
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
    private long etniaId;
    private long tipoId;
}