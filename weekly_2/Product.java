package weekly_2;

public abstract class Product {
    private String name;
    private int price;
    private double weight;
    public Product(String name, int price, double weight) {
        this.name=name;
        this.price=price;
        this.weight=weight;
    }
    public String getName(String name) {
        return name;
    }
    public int getPrice(int price) {
        return price;
    }
    public double getWeight(double weight) {
        return weight;
    }
    public int getDeliveryCharge(int price, double weight) {
        int charge;

        if (weight < 3 && weight >= 0) charge = 100000;
        else if(weight >= 3 && weight < 10) charge = 500000;
        else charge = 10000;

        if (price < 300000 && price >= 0) return charge;
        else if(price>=300000 && price<10000000) return charge-1000;
        else return 0;

    }
}

