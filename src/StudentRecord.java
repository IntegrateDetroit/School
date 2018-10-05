import java.util.ArrayList;
import java.util.List;

public class StudentRecord {

    List<Course> courseList;
    public StudentRecord(){
        courseList = new ArrayList<>();
    }
    public List<Course> getCourseList() {
        return courseList;
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }
}
