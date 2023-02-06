package matriculacion.form.api_institution;

import lombok.Data;

@Data
public class InstitutionDTO {
    private long id;
    private String nombre;
    private String direccion;
    private String email;
    private String telefono;
    private String actividad;
}
