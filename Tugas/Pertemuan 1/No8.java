import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2}, {1,2,3}, {2,3,4}, {3,4,5}, {4,5,6}, {5,6,7}, {6,7,8}, {7,8,9}, {8,9,0}, {9,0,1}};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka yang ingin di cari (0-9) : ");
        int angka = 0;

        try {
            angka = Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            System.out.println("Inputan harus berupa bilangan bulat positif!!!");
            System.exit(0);
            input.close();
        }
        
        boolean cari = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == angka) {
                    System.out.printf("Found %d at [%d][%d]\n", angka, i, j );
                    cari = true;
                }
            }
        }
        if (!cari) {
            System.out.printf("Bilangan %d tidak dapat ditemukan\n", angka);
        }
    }
}
