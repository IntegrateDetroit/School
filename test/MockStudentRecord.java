import java.util.List;

public class MockStudentRecord implements StudentRecordInterface {

    private boolean hasStudentTakenCourse;
    private int hasStudentTakenCounter;
    private CourseInterface requestedCourse;

    @Override
    public boolean hasStudentTaken(CourseInterface course) {
        requestedCourse = course;
        hasStudentTakenCounter++;
        return this.hasStudentTakenCourse;
    }

    public CourseInterface getRequestedCourse() {
        return requestedCourse;
    }

    public int getHasStudentTakenCounter() {
        return hasStudentTakenCounter;
    }

    public void setHasStudentTaken(boolean hasTaken){
        this.hasStudentTakenCourse = hasTaken;
    }


    @Override
    public List<Course> getCourseList() {
        return null;
    }

    @Override
    public void addCourse(Course course) {

    }
}
