import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama = "", hobi = "";
        int umur = 0;
        try {
            System.out.print("Name\t:");
            nama = input.nextLine();
            System.out.print("Umur\t:");
            umur = input.nextInt();
            input.nextLine();
            System.out.print("Hobby\t:");
            hobi = input.nextLine();
        } catch (Exception e) {
            System.out.println("Inputan umur harus berupa angka!!");
            System.exit(0);
        }
        System.out.println("Nama saya " + nama + ", umur " + umur + " tahun, hobby " + hobi);
        System.out.printf("Nama saya %s, umur %d tahun, hobby %s", nama, umur, hobi);
        input.close();
    }
}
