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


}