package Th2;

import java.io.Serializable;

public class Product implements Serializable {
    private static int idCount = 1;
    private int productId;
    private String productName;
    private String Manufacturer;
    private double price;
    private String description;

    public Product() {
        this. productId = idCount++;
    }

    public Product(int productId, String productName, String manufacturer, double price, String description) {
        this.productId = productId;
        this.productName = productName;
        Manufacturer = manufacturer;
        this.price = price;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
