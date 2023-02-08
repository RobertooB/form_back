package matriculacion.form.observations;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
import matriculacion.form.form_inscription.FormInscription;

@Data
@Entity
public class Observations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private Boolean completado;
    // @JsonBackReference
    // @ManyToOne
    // @JoinColumn(name = "form_inscription_id", referencedColumnName = "id")
    // private FormInscription form_inscription;
}
