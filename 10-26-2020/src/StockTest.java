public class StockTest {
    public static void main(String[] args) {
        Stock oracle = new Stock("ORCL", "Oracle Corportation");
        oracle.setPreviousClosingPrice(34.5);
        oracle.setCurrentPrice(34.35);
        System.out.println("Price change for " + oracle.getName() + " (" + oracle.getSymbol() + ")" + ": " + oracle.getChangePercent() + "%");
    }
}
