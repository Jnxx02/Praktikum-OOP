abstract class AbsSmartphone {
    private int price;
    private String brand;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

abstract class AbsCar {
    private int totalForwardGear;
    private String color;
    private int maxSpeed;

    public int getTotalForwardGear() {
        return totalForwardGear;
    }

    public void setTotalForwardGear(int totalForwardGear) {
        this.totalForwardGear = totalForwardGear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

interface Inter { 
    void move();
}


class MySmartphone extends AbsSmartphone implements Inter {

    @Override
    public void move() {
        System.out.println("Smartphone telah berpindah");
    }
}

class MyCar extends AbsCar implements Inter {

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}