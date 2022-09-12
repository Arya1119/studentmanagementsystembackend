package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.Course;
import in.ac.charusat.studentmgmtsystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;
//    List<Student> students = new ArrayList<>(
//            Arrays.asList(
//                    new Student(1, "Tom", "US"),
//                    new Student(2, "Harry", "Canada"),
//                    new Student(3, "Nick", "UK")
//            )
//    );

    // Mappings - URL endpoints
    // Get the list of all student
    @GetMapping("/listCourse")
    public List<Course> getAllCourseNames() {
        return courseRepository.findAll();
    }

    // Get the student information
    @GetMapping("/course/{id}")
    public Course getCourseName(@PathVariable Integer id) {
        return courseRepository.findById(id).get();
    }

    // Delete the student
    @DeleteMapping("/course/{id}")
    public List<Course> deleteCourseName(@PathVariable Integer id) {
        courseRepository.delete(courseRepository.findById(id).get());
        return courseRepository.findAll();
    }

    // Add new student
    @PostMapping("/course")
    public List<Course> addCourseName(@RequestBody Course course) {
        courseRepository.save(course);
        return courseRepository.findAll();
    }

    // Update the student information
    @PutMapping("/course/{id}")
    public List<Course> updateCourse(@RequestBody Course course, @PathVariable Integer id) {
        Course courseObj = courseRepository.findById(id).get();
        courseObj.setCourseName(course.getCourseName());
        courseObj.setDescription(course.getDescription());
        courseRepository.save(courseObj);
        return courseRepository.findAll();
    }
}
