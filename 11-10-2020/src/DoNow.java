public class DoNow {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            while (y < 5) {
                System.out.print("*");
                y++;
            }
            System.out.println();
            y = 0;
            x++;
        }
    }
}
