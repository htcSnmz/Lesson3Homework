public class StudentManager extends UserManager {

    public void registerTheCourse(User user, Course course){
        System.out.println(user.getName() + course.getName() + " kursuna kayıt oldunuz");

    }
}
