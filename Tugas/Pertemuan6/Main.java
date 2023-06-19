abstract class Dog {
    private int position;
    private int averageLength;
    
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAverageLength() {
        return averageLength;
    }

    public void setAverageLength(int averageLength) {
        this.averageLength = averageLength;
    }

    abstract void move();
    abstract void describe();
}

class Pitbull extends Dog {
    @Override
    void move() {
        System.out.println(super.getPosition() + 3);
    }

    @Override
    void describe() {
        System.out.println("Badannya berotot");
    }
}

class SiberianHusky extends Dog {
    @Override
    void move() {
        System.out.println(super.getPosition() + 2);
    }

    @Override
    void describe() {
        System.out.println("Tampangnya elegan dan menyerupai serigala");
    }
}
class Bulldog extends Dog {
    @Override
    void move() {
        System.out.println(super.getPosition() + 1);
    }

    @Override
    void describe() {
        System.out.println("Badannya berotot tapi pendek");
    }
}
class GermanShepherd extends Dog {
    @Override
    void move() {
        System.out.println(super.getPosition() + 3);
    }

    @Override
    void describe() {
        System.out.println("Badannya lumayan berotot dengan telinga tegak dan runcing");
    }
}



public class Main {
    public static void main(String[] args) {
        SiberianHusky siberianHusky = new SiberianHusky();
        System.out.print("Posisi anjing dalam cartesius: ");
        siberianHusky.move();
        System.out.print("Ciri-ciri: ");
        siberianHusky.describe();
        siberianHusky.setAverageLength(54);
        System.out.printf("Rata-rata panjang: %s\n", siberianHusky.getAverageLength());
        System.out.println("-".repeat(10));
        MySmartphone smartphone = new MySmartphone();
        smartphone.setBrand("Iphong");
        smartphone.setPrice(15000000);
        System.out.printf("Smartphone merk %s dengan harga %d\n", smartphone.getBrand(), smartphone.getPrice());
        smartphone.move();
        System.out.println("-".repeat(10));
        MyCar myCar = new MyCar();
        myCar.setColor("Pink");
        myCar.setMaxSpeed(200);
        myCar.setTotalForwardGear(6);
        System.out.printf("Mobil berwarna %s memiliki kecepatan maksimum %d dengan total gigi maju sebanyak %d\n", myCar.getColor(), myCar.getMaxSpeed(), myCar.getTotalForwardGear());
        myCar.move();
    }
}