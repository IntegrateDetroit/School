import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StudentRecordTest {


    @Test
    public void studentRecord_hasNoCourses_whenCreated(){

        StudentRecord studentRecord = new StudentRecord();
        assertThat(studentRecord.getCourseList().size()).isEqualTo(0);
    }

    @Test
    public void studentRecords_addsCoursesToCourseList_whenCourseAdded(){
        StudentRecord studentRecord = new StudentRecord();
        Course course = new Course(null, 3);

        studentRecord.addCourse(course);

        assertThat(studentRecord.getCourseList()).contains(course);
    }
}