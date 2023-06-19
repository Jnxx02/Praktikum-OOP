import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 0;
        
        try {
            System.err.println("Masukkan jari-jari lingkaran : ");
            radius = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka!!");
            System.exit(0);
        }
        double luas = Math.PI * radius * radius;
        System.out.printf("Luas lingkaran tersebut adalah %.2f cm^2", luas);
        input.close();
    }
}
