public class DiplomaWithHonors extends Diploma {

    private String name, course;

    public  DiplomaWithHonors(String n, String c){
        super(n, c);
    }

    @Override
    public String toString() {
        return super.toString() + "\n*** with honors ***";
    }
}
