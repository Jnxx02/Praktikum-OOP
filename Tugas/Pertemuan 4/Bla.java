public class Bla {
    public static void main(String[] args) {
        Car car = new Car();

        car.setBrand("Mitsubishi");
        car.setModel("Xpander");
        car.setYear(2019);
        car.setPrice(290000000);
        car.setSold(false);

        car.displayInfo();

        Car car2 = new Car("Mitshubishi", "Triton", 2021, 2000000, false);
        car2.getBrand();
        car2.getModel();
        car2.getYear();
        car2.getPrice();
        car2.isSold();
        
        System.out.printf("\n" + SelfUtils.displaySelfData());
    
    }
}
