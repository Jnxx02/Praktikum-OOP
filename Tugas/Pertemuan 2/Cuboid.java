public class Cuboid {
    double height, width, length;

    double getVolume() {
        //Lengkapi
        return height * width * length;
    }
}

class cube {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        //Lengkapi
        cuboid.height = 90.00;
        cuboid.width = 5.00;
        cuboid.length = 10.00;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}