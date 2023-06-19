import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * TODO 1
         * Instance Objek Mahasiswa
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        Mahasiswa mahasiswa = new Mahasiswa("Ikhsan", "H071191049");

        /*
         * TODO 2
         * Instance Objek MataKuliah
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        MataKuliah matkul = new MataKuliah();
        matkul.setNamaMatkul("OOP");
        /*
         * TODO 3
         * Instance Objek NilaiPraktikum
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        NilaiPraktikum nilaiPraktikum = new NilaiPraktikum(78, 100);

        /*
         * TODO 4
         * Instance Objek NilaiKelas
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        NilaiKelas nilaiKelas = new NilaiKelas(80, 90);

        /*
         * TODO 5
         * Kirimkan objek mahasiswa, nilaiKelas dan nilaiPraktikum
         * ke method runApp
         */
        
        runApp();
    }

    private static void runApp(Mahasiswa mahasiswa, NilaiKelas nilaiKelas, NilaiPraktikum nilaiPraktikum) {
        /*
         * TODO 6
         * Tampilkan data mahasiwa dan matakuliah seperti contoh berikut :
         * Nilai Matkul - OOP
         * Ikhsan(H071191049)
         */
        mahasiswa.show(mahasiswa.getNamaMatkul());
        System.out.printf("%s(%s)", mahasiswa.getNama(), mahasiswa.getNim());


        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Show Nilai Praktikum");
        System.out.println("2. Show Nilai Kelas");
        System.out.println("3. Show Feedback");
        System.out.print("> ");
        int inp = scanner.nextInt();
        switch (inp) {
            case 1:
                System.out.println("-".repeat(25));
                System.out.println("Nilai Praktikum");
                // TODO 7 : Tampilkan Detail Nilai Praktikum
                nilaiPraktikum.showDetail();
                break;
            case 2:
                System.out.println("-".repeat(25));
                System.out.println("Nilai Kelas");
                // TODO 8 : Tampilkan Detail Nilai Kelas
                nilaiKelas.showDetail();
                break;
            case 3:
                System.out.println("=".repeat(25));
                // TODO 9 : Tampilkan Data Diri (showMyData)
                HelperMid.showMyData();
                // TODO 10 : Tampilkan Kritik dan Saran
                HelperMid.showFeedbackLab();
                System.out.println("=".repeat(25));
                break;
            default:
                break;
        }
        scanner.close();

    };
}