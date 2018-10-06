import java.util.List;

public interface StudentRecordInterface {

    boolean hasStudentTaken(CourseInterface course);

    List<Course> getCourseList();

    void addCourse(Course course);

}
