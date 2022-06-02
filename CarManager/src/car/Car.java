package car;

import java.io.Serializable;

public class Car implements Serializable{
    private String id, name, brand;
    private int year,amount;
    private double cost;

    public Car() {
    }

    public Car(String id) {
        this.id = id;
    }

    public Car(String id, String name, String brand, int year, int amount, double cost) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.amount = amount;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", name=" + name + ", brand=" + brand + ", year=" + year + ", amount=" + amount + ", cost=" + cost + '}';
    }
}
