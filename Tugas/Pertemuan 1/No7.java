import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        String[] buah = {"Apple", "Orange", "Melon", "Strawberry", "Mango"};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan buah yang dicari (dalam bahasa inggres) : ");
        String cari = input.nextLine();
        input.close();

        System.out.println(findIndex(buah, cari));
    }
    public static int findIndex(String[] array, String teks) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(teks)) {
                return i;
            }
        }
        return -1;
    }
}
