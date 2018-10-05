public class Student {

    String name;
    private StudentRecord studentRecord;
    private Majors major;

    public Student(String name, StudentRecord studentRecord) {
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

    public void enroll(Course course){
        //check to see whether student has taken class previously
            //through studentrecord - get class list
            //check class list
        //if not, enroll
            //course.enrollStudent
        //add course to student record
            //studentRecord, add class to class list
    }

    public StudentRecord getStudentRecord() {
        return this.studentRecord;
    }
}
