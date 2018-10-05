public class Registrar {

    public static void main(String[] args) {
        Course harryPotterCourse = new Course("Harry Potter and Language", 5);
        Course engineeringCourse = new Course("Intro to Engineering", 10);
        Course spanishCourse = new Course("Spanish I", 3);
        Course csCourse = new Course("CS 101", 6);
        Course farmingCourse = new Course("Farming", 1);
        Course calculusCourse = new Course("Calculus I", 15);

        Student steve_a = new Student("Steve A", new StudentRecord());
        Student samah_m = new Student("Samah M", new StudentRecord());
        Student deShayla_c = new Student("DeShayla C", new StudentRecord());
        Student stephanie_v = new Student("Stephanie V", new StudentRecord());
        Student joya_p = new Student("Joya P", new StudentRecord());

        joya_p.enroll(csCourse);
    }
}
