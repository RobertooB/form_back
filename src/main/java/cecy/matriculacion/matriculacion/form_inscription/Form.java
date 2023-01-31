package cecy.matriculacion.matriculacion.form_inscription;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table(name = "forms_inscription", schema = "form_inscription")
public class Form {
    @Id
    @Column
    private long id;
    @Column ("sponsored_course")
    private boolean sponsoredCourse;
    @Column ("institution_contact")
    private String institutionContact;

    //foreign key api_person
    @Column ("user_id")
    private long userId;

    //foreign key courses
    private long requirements;
    @Column ("course_id")
    private long courseId;
    @Column ("other_courses")
    private long otherCourses;

    //foreign key catalogue
    private long publicity;

}
