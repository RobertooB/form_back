package matriculacion.form.api_courses;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "bff.courses", url = "http://172.16.12.95:3000/api/v1/courses")
public interface CoursesClient {
    @GetMapping("/{id}/")
    CoursesDTO findCoursesByIdDto(@PathVariable("id") Long id);

    @GetMapping("/")
    List<CoursesDTO> findAll();
}
