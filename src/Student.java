public class Student implements StudentInterface{

    String name;
    private StudentRecordInterface studentRecord;
    private Majors major;

    public Student(String name, StudentRecordInterface studentRecord) {
        this.name = name;
        this.studentRecord = studentRecord;
        major = Majors.UNDECIDED;

    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return 0;
    }

    public Majors getMajor() {
        return this.major;
    }

    public void setMajor(Majors major) {
        this.major = major;
    }

    public boolean enroll(CourseInterface course){
        boolean studentHasTakenCourse = studentRecord.hasStudentTaken(course);
        if (studentHasTakenCourse){
            return false;
        }
        return course.enrollStudent(this);
    }

    public StudentRecordInterface getStudentRecord() {
        return this.studentRecord;
    }
}







