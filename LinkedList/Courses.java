public class Courses {
    public static void main(String[] args) {
        String[] courses = { "Math", "English", "Programming" };
        String result = "";

        for(String course : courses) {
            if(course.length() > 7) {
                continue;
            }
            result += course + " ";
        }
        System.out.println(result);

    }
}