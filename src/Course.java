public class Course {
    private String name;
    Student[] studentList;
    int currentClassSize = 0;
    int capacity;

    public Course(String name, int capacity){
        this.name = name;
        studentList = new Student[capacity];
        this.capacity = capacity;
    }
    public void enrollStudent(Student student) {
        // TODO enrollStudent needs to return true if the student was added, false otherwise
        //TODO enrollStudent needs to check that the student being added is not already enrolled
        if(currentClassSize >= capacity)
            return;
        studentList[currentClassSize++] = student;
    }

    public Student[] getRegisteredStudents() {
        return studentList;
    }

    public String getName() {
        return this.name;
    }
}
