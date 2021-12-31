public class Diploma {
    private String name, course;

    public Diploma(String n, String c) {
        name = n;
        course = c;
    }

    public String toString() {
        return "This certifies that " + name + "\nhas completed a course in " + course;
    }
}
