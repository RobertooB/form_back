package matriculacion.form.form_inscription;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import matriculacion.form.catalogue_cecy.CatalogueCecy;
import matriculacion.form.documents.Documents;
import matriculacion.form.observations.Observations;

@Data
@Entity
public class FormInscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean sponsoredCourse;
    private String institutionContact;

    // foreign key api_person
    private Long userId;

    // foreign key courses
    private Long courseId;

    private Long otherCourses;

    @OneToOne()
    @JoinColumn(name = "state_id", referencedColumnName = "id")
    private CatalogueCecy state;

    // foreign key catalogue
    @OneToOne()
    @JoinColumn(name = "publicity_id", referencedColumnName = "id")
    private CatalogueCecy publicity;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "form_inscription_id")
    private List<Documents> documents;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "form_inscription_id")

    private List<Observations> observations;
}
