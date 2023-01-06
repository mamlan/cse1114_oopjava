package src.cse114;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public void Stock() {

    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) * 100.0 / previousClosingPrice;
    }

    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Orcal Corporation", 34.5, 34.35);
        System.out.println("Price change percentage: " + stock1.getChangePercent() + "%");

        Stock stock2 = new Stock("FB", "Facebook INC", 80.07, 81.35);
        System.out.println("Price change percentage: " + stock2.getChangePercent() + "%");
    }
    }


