public class DiplomaTest {
    public static void main(String[] args) {
        Diploma diploma1 = new Diploma("Murray Smith", "Gardening");
        System.out.println(diploma1);
        System.out.println();

        Diploma diploma2 = new DiplomaWithHonors("Lisa Smith", "Evolutionary Psychology");
        System.out.println(diploma2);
        System.out.println();
    }
}
