public class MockStudent implements StudentInterface {

    private int getMajorCount = 0;
    private Majors major;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getGPA() {
        return 0;
    }

    @Override
    public Majors getMajor() {
        getMajorCount++;
        return major;
    }

    @Override
    public void setMajor(Majors major) {

        this.major = major;
    }

    @Override
    public boolean enroll(CourseInterface course) {
        return false;
    }

    @Override
    public StudentRecordInterface getStudentRecord() {
        return null;
    }

    public int getGetMajorCount() {
        return getMajorCount;
    }
}
