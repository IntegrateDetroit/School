import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CourseTest {

    @Test
    public void enrollStudent_studentAppearsInClassList() {
        Student student = new Student("student name", null);
        Student student2 = new Student("student2 name", null);
        Course myCourse = new Course(null, 2);
        myCourse.enrollStudent(student);
        myCourse.enrollStudent(student2);
        Student[] students = myCourse.getRegisteredStudents();
        assertThat(students).contains(student);
        assertThat(students).contains(student2);
    }

    @Test
    public void course_hasName(){
        String name = "name";
        Course course = new Course(name, 1);
        assertThat(course.getName()).isEqualTo(name);
  }

    @Test
    public void enrollStudent_doesNotAddStudentToCourse_ifAtCapacity(){
        Course course = new Course(null, 1);

        Student student = new Student("", null);
        Student student1 = new Student("", null);

        course.enrollStudent(student);
        course.enrollStudent(student1);

        Student[] registeredStudents = course.getRegisteredStudents();

        assertThat(registeredStudents).contains(student);
        assertThat(registeredStudents).doesNotContain(student1);
    }

    @Test
    public void settingCapacity_allows_capacityNumberOfStudentsToRegister(){
        Course course = new Course(null, 12);
        for(int i=0;i<13;i++){
            course.enrollStudent(new Student("z", null));
        }
        Student[] registeredStudents = course.getRegisteredStudents();
        assertThat(registeredStudents.length).isEqualTo(12);
    }
}
