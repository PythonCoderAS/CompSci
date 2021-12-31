public class Stock {
    private String symbol, name;
    private double previousClosingPrice, currentPrice;

    public Stock(String s, String n) {
        symbol = s;
        name = n;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double cp) {
        currentPrice = cp;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double pcp) {
        previousClosingPrice = pcp;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
