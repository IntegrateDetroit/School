public interface CourseInterface {

    boolean enrollStudent(Student student);

    Student[] getRegisteredStudents();

    String getName();
}
