import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StudentTest {

    Student student;

    @BeforeEach
    public void setUp(){
        student = new Student("Generic Student", null);
    }

    @Test
    public void student_createdWithName_isInitialized(){
        String name = "This is a name";
        StudentRecord studentRecord = new StudentRecord();

        Student student = new Student(name, studentRecord);

        assertThat(student.getName()).isEqualTo(name);
        assertThat(student.getGPA()).isEqualTo(0.0);
        assertThat(student.getMajor()).isEqualTo(Majors.UNDECIDED);
        assertThat(student.getStudentRecord()).isEqualTo(studentRecord);

        String name2 = "This is a different name";
        Student student2 = new Student(name2, studentRecord);
        assertThat(student2.getName()).isEqualTo(name2);
    }

    @Test
    public void student_setMajor(){
        Majors major = Majors.ELECTRICAL_ENGINEERING;
        student.setMajor(major);
        assertThat(student.getMajor()).isEqualTo(major);
    }

    @Test
    public void student_enroll_success(){
        MockStudentRecord mockRecord = new MockStudentRecord();
        mockRecord.setHasStudentTaken(false);

        MockCourse mockCourse = new MockCourse();
        mockCourse.setEnrollStudent(true);

        Student student = new Student("name", mockRecord);

        boolean enrollResult = student.enroll(mockCourse);

        assertThat(enrollResult).isTrue();

        assertThat(mockRecord.getHasStudentTakenCounter()).isEqualTo(1);
        assertThat(mockRecord.getRequestedCourse()).isEqualTo(mockCourse);

        assertThat(mockCourse.getEnrollStudentCounter()).isEqualTo(1);
        assertThat(mockCourse.getEnrolledStudent()).isEqualTo(student);
    }

    @Test
    public void student_enroll_failure_ifStudentHasTakenCourseBefore(){
        MockStudentRecord mockRecord = new MockStudentRecord();
        MockCourse mockCourse = new MockCourse();

        mockRecord.setHasStudentTaken(true);

        Student student = new Student("", mockRecord);

        boolean enrollResult = student.enroll(mockCourse);

        assertThat(mockRecord.getHasStudentTakenCounter()).isEqualTo(1);
        assertThat(mockCourse.getEnrollStudentCounter()).isEqualTo(0);
        assertThat(enrollResult).isFalse();
    }

    @Test
    public void student_enroll_failure_ifCourseCannotEnroll(){
        MockStudentRecord mockRecord = new MockStudentRecord();
        MockCourse mockCourse = new MockCourse();

        mockRecord.setHasStudentTaken(false);
        mockCourse.setEnrollStudent(false);

        Student student = new Student("", mockRecord);

        boolean enrollResult = student.enroll(mockCourse);

        assertThat(mockRecord.getHasStudentTakenCounter()).isEqualTo(1);
        assertThat(mockCourse.getEnrollStudentCounter()).isEqualTo(1);
        assertThat(enrollResult).isFalse();
    }


}