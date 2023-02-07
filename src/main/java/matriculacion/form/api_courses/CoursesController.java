package matriculacion.form.api_courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/courses")
public class CoursesController {

    @Autowired
    CoursesClient coursesClient;

    @GetMapping("/{id}/")
    public CoursesDTO findById(@PathVariable Long id) {
        return coursesClient.findCoursesByIdDto(id);
    }

    @GetMapping("/")
    public List<CoursesDTO> findAll(){
        return coursesClient.findAll();
    }

}
