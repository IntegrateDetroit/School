public interface CourseInterface {

    boolean enrollStudent(StudentInterface student);

    StudentInterface[] getRegisteredStudents();

    String getName();

    Majors getMajor();
}
