public class TrioTest {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich("Cheeseburger", 2.75);
        Salad salad = new Salad("Spinach Salad", 1.25);
        Drink drink = new Drink("Orange Soda", 1.25);
        Trio trio = new Trio(sandwich, salad, drink);
        System.out.println(trio.getName());
        System.out.println(trio.getPrice());
    }
}
