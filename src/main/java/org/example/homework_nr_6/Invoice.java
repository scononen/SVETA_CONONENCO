package org.example.homework_nr_6;

public class Invoice {
    public static void main(String[] args) {
        Invoice Client1 = new Invoice("SM154","phone",2,1300.5);
        System.out.println(Client1.getAmount());

        Client1.setPrice(1200.4);
        Client1.setQuantity(-3);
        System.out.println(Client1.getAmount());
    }
    private String ModelDevice;
    private String ProductDescription;
    private int Quantity;
    private double Price;

    public Invoice(String modelDevice, String productDescription, int quantity, double price) {
        ModelDevice = modelDevice;
        ProductDescription = productDescription;
        Quantity = quantity;
        Price = price;
    }

    public String getModelDevice() {
        return ModelDevice;
    }

    public void setModelDevice(String modelDevice) {
        ModelDevice = modelDevice;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity>0) {Quantity = quantity;} else {Quantity=0;}
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        if (price > 0) {Price = price; } else { price = 0.0;}
    }
    public double getAmount() {
        return getQuantity() * getPrice();
    }
}
