public class MockCourse implements CourseInterface {

    private boolean enrolled;
    private int enrollStudentCounter;
    private Student enrolledStudent;

    @Override
    public boolean enrollStudent(Student student) {
        enrolledStudent = student;
        enrollStudentCounter++;
        return enrolled;
    }

    public Student getEnrolledStudent() {
        return enrolledStudent;
    }

    public int getEnrollStudentCounter() {
        return enrollStudentCounter;
    }

    public void setEnrollStudent(boolean enrolled){

        this.enrolled = enrolled;
    }

    @Override
    public Student[] getRegisteredStudents() {
        return new Student[0];
    }

    @Override
    public String getName() {
        return null;
    }
}
