public interface StudentInterface {

    String getName();

    double getGPA();

    Majors getMajor();

    void setMajor(Majors major);

    boolean enroll(CourseInterface course);


    StudentRecordInterface getStudentRecord();


}
