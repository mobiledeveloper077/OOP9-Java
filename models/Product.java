package models;

public class Product {

    private String name;
    private String info;
    private double price;
    private int count;

    public Product(String name, String info, double price, int count) {
        this.name = name;
        this.info = info;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
