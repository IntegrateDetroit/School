public class MockCourse implements CourseInterface {

    private boolean enrolled;
    private int enrollStudentCounter;
    private StudentInterface enrolledStudent;

    @Override
    public boolean enrollStudent(StudentInterface student) {
        enrolledStudent = student;
        enrollStudentCounter++;
        return enrolled;
    }

    public StudentInterface getEnrolledStudent() {
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

    public Majors getMajor(){
        return null;
    }
}
