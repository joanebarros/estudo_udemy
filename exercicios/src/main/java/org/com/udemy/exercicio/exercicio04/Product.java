package org.com.udemy.exercicio.exercicio04;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalVelueInEstock() {
        return price * quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());

    }

    private Object totalValueInStock() {
        return null;
    }


    public void addProducts(int quantity) {
    }
}
