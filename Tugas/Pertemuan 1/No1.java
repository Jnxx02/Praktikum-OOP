import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM Anda: ");
        String nim = input.nextLine();
        String nimLastThreeDigits = nim.substring(nim.length() - 3);
        int lastThreeDigits = Integer.parseInt(nimLastThreeDigits);
        System.out.println("Nomor soal yang diperoleh: " + (lastThreeDigits % 7 == 0 ? 7 : lastThreeDigits % 7));
        input.close();
    }
}