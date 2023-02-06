package matriculacion.form.form_inscription;

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
    @JoinColumn(name = "catalogue_cecy_id", referencedColumnName = "id")
    private CatalogueCecy state;

    // foreign key catalogue
    @OneToOne()
    @JoinColumn(name = "catalogue_cecy_id", referencedColumnName = "id")
    private CatalogueCecy publicity;
}
