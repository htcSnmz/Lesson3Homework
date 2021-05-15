public class Main {

    public static void main(String[] args) {

        Course course = new Course();
        course.setName("Java & React");

        Student student = new Student();
        student.setName("Hatice");

        StudentManager studentManager = new StudentManager();
        studentManager.signUpToTheSystem(student);

    }


}
