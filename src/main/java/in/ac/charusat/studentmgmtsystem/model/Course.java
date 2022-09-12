package in.ac.charusat.studentmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Course {
    @Id
    private Integer CourseId;
    private String CourseName;
    private String Description;

    public Course(Integer id, String name, String Description) {
        this.CourseId = id;
        this.CourseName = name;
        this.Description = Description;
    }

    public Course() {

    }

    public Integer getCourseId() {
        return CourseId;
    }

    public void setCourseId(Integer CourseId) {
        this.CourseId = CourseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String name) {
        this.CourseName = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
}
