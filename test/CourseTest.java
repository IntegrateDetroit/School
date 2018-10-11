import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CourseTest {

    @Test
    public void enrollStudent_studentAppearsInClassList() {
        Student student = new Student("student name", null);
        Student student2 = new Student("student2 name", null);
        Course myCourse = new Course(null, 2, null);
        myCourse.enrollStudent(student);
        myCourse.enrollStudent(student2);
        StudentInterface[] students = myCourse.getRegisteredStudents();
        assertThat(students).contains(student);
        assertThat(students).contains(student2);
    }

    @Test
    public void course_hasName() {
        String name = "name";
        Course course = new Course(name, 1, null);
        assertThat(course.getName()).isEqualTo(name);

    }

    @Test
    public void course_hasMajor() {
        Course course = new Course("", 1,Majors.COMPUTER_SCIENCE);
        assertThat(course.getMajor()).isEqualTo(Majors.COMPUTER_SCIENCE);

        Majors major = Majors.ELECTRICAL_ENGINEERING;

        Course course2 = new Course("", 1,major);

        assertThat(course2.getMajor()).isEqualTo(major);
    }

    @Test
    public void enrollStudent_doesNotAddStudentToCourse_ifAtCapacity() {
        Course course = new Course(null, 1, null);

        Student student = new Student("", null);
        Student student1 = new Student("", null);
        Student student2 = new Student("", null);

        boolean result = course.enrollStudent(student);
        boolean result1 = course.enrollStudent(student1);
        boolean result2 = course.enrollStudent(student2);

        StudentInterface[] registeredStudents = course.getRegisteredStudents();

        assertThat(registeredStudents).contains(student);
        assertThat(registeredStudents).doesNotContain(student1);
        assertThat(registeredStudents).doesNotContain(student2);
        assertThat(result).isTrue();
        assertThat(result1).isFalse();
        assertThat(result2).isFalse();


    }

    @Test
    public void settingCapacity_allows_capacityNumberOfStudentsToRegister() {
        Course course = new Course(null, 12, null);
        for (int i = 0; i < 13; i++) {
            course.enrollStudent(new Student("z", null));
        }
        StudentInterface[] registeredStudents = course.getRegisteredStudents();
        assertThat(registeredStudents.length).isEqualTo(12);
    }
    @Test
    public void enrollStudent_allowsStudentToEnrollIfMajorIsValid() {
        Majors major = Majors.ELECTRICAL_ENGINEERING;
        Course course = new Course(null, 12, major);

        MockStudent mockStudent = new MockStudent();
        mockStudent.setMajor(major);

        boolean result = course.enrollStudent(mockStudent);
        StudentInterface[] registeredStudents = course.getRegisteredStudents();
        assertThat(mockStudent.getGetMajorCount()).isEqualTo(1);
        assertThat(registeredStudents).contains(mockStudent);
        assertThat(result).isTrue();
    }

    @Test
    public void enrollStudent_preventsStudentFromEnrollingIfMajorIsNotValid() {
        Majors major = Majors.ELECTRICAL_ENGINEERING;
        Course course = new Course(null, 12, major);

        MockStudent mockStudent = new MockStudent();
        mockStudent.setMajor(Majors.HISTORY);

        boolean result = course.enrollStudent(mockStudent);
        StudentInterface[] registeredStudents = course.getRegisteredStudents();


        assertThat(mockStudent.getGetMajorCount()).isEqualTo(1);
        assertThat(registeredStudents).doesNotContain(mockStudent);
        assertThat(result).isFalse();
    }
}
