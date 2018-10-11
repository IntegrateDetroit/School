public class Course implements CourseInterface {
    private String name;
    StudentInterface[] studentList;
    int currentClassSize = 0;
    int capacity;
    Majors major;

    public Course(String name, int capacity, Majors major) {
        this.name = name;
        studentList = new StudentInterface[capacity];
        this.capacity = capacity;
        this.major = major;

    }

    public boolean enrollStudent(StudentInterface student) {


        if (this.major == null || this.major == student.getMajor()) {

            if (currentClassSize >= capacity) {
                return false;
            }
            studentList[currentClassSize++] = student;
            return true;
        }
        return false;
    }

    public StudentInterface[] getRegisteredStudents() {
        return studentList;
    }

    public String getName() {
        return this.name;
    }

    public Majors getMajor() {
        return this.major;
    }


}
