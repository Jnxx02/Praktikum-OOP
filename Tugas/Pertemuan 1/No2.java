import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahData = 0, ganjil = 0, genap = 0, bukanAngka = 0;
        
        try {
            System.out.println("Masukkan jumlah data : ");
            jumlahData = input.nextInt();
        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka!!");
            System.exit(0);
        }

        for (int i = 0; i < jumlahData; i++) {
            double num = 0;

            try {
                num = input.nextDouble();
                if (num % 2 == 0) {
                    genap++;
                } else if (num % 2 != 0) {
                    ganjil++;
                } else {
                    bukanAngka++;
                }
            } catch (Exception e) {
                bukanAngka++;
            }
        }

        System.out.println(ganjil + " Bilangan Ganjil");
        System.out.println(genap + " Bilangan Genap");
        System.out.println(bukanAngka + " Bukan Angka");

        input.close();
    }
}
