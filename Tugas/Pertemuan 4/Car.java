public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isSold;

    public Car() {

    }
    
    public void displayInfo() {
        System.out.printf("Merk: %s\nModel: %s\nTahun Terbit: %d\nHarga: %.3f\nTerjual? %b", brand, model, year, price, isSold);
    }
    
    public Car (String brand, String model, int year, double price, boolean isSold) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isSold = isSold;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isSold() {
        return isSold;
    }
    public void setSold(boolean isSold) {
        this.isSold = isSold;
    }
    
}
