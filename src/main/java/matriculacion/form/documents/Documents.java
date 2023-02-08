package matriculacion.form.documents;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import matriculacion.form.form_inscription.FormInscription;

@Data
@Entity
public class Documents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date fechaSubida;
    private String archivoUrl;

    // @JsonBackReference
    // @ManyToOne
    // @JoinColumn(name = "form_inscription_id", referencedColumnName = "id")
    // private FormInscription form_inscription;
}
