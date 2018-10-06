import java.util.ArrayList;
import java.util.List;

public class StudentRecord implements StudentRecordInterface{

    List<Course> courseList;
    public StudentRecord(){
        courseList = new ArrayList<>();
    }

    //has student taken class?

    @Override
    public boolean hasStudentTaken(CourseInterface course) {
        return false;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }
}
