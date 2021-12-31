/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor {
    // Fields:
    private int price, num, bal = 0;
    private static double totalSales = 0;

    public static double getTotalSales(){
        double val = totalSales;
        totalSales = 0;
        return val;
    }

    /**
     * Constructs a Vendor
     *
     * @param price the price of a single item in cents (int)
     * @param stock number of items to place in stock (int)
     */
    public Vendor(int price, int stock) {
        this.price = price;
        this.num = stock;
    }

    /**
     * Returns the number of items currently in stock.
     *
     * @return number of items currently in stock (int)
     */
    public int getStock() {
        return this.num;
    }

    /**
     * Sets the quantity of items in stock.
     *
     * @param qty number of items to place in stock (int)
     */
    public void setStock(int qty) {
        this.num = qty;
    }

    /**
     * Adds a specified amount (in cents) to the
     * deposited amount.
     *
     * @param number of cents to add to the deposit (int)
     */
    public void addMoney(int number) {
        this.bal += number;
    }

    /**
     * Returns the currently deposited amount (in cents).
     *
     * @return number of cents in the current deposit (int)
     */
    public int getDeposit() {
        return this.bal;
    }

    /**
     * Implements a sale.  If there are items in stock and
     * the deposited amount is greater than or equal to
     * the single item price, then adjusts the stock
     * and calculates and sets change and returns true;
     * otherwise refunds the whole deposit (moves it into
     * change) and returns false.
     *
     * @return true for a successful sale, false otherwise (boolean)
     */
    public boolean makeSale() {
        if (this.num > 0 && this.bal >= this.price) {
            this.num--;
            this.bal -= this.price;
            totalSales += (double) this.price / 100;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns and zeroes out the amount of change (from
     * the last sale or refund).
     *
     * @return number of cents in the current change (int)
     */
    public int getChange() {
        int bal = this.bal;
        this.bal = 0;
        return bal;
    }
}
