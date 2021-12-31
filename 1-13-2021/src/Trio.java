public class Trio implements MenuItem {
    Sandwich sandwich;
    Salad salad;
    Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName() {
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }

    public double getPrice() {
        double[] prices = {salad.getPrice(), sandwich.getPrice(), drink.getPrice()};
        double lowest = Math.min(prices[0], Math.min(prices[1], prices[2]));
        double sum = 0;
        boolean skippedLowest = false;
        for (double price : prices) {
            if (price != lowest || skippedLowest) {
                sum += price;
            } else {
                skippedLowest = true;
            }
        }
        return sum;
    }
}
