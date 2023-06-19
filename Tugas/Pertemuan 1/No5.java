import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tanggal = input.nextLine();
        System.out.println(hasilKonversi(tanggal));
        input.close();
    }
    public static String hasilKonversi (String tanggal) {
        String[] pembagian = tanggal.split("-");
        int hari = Integer.parseInt(pembagian[0]);
        int bulan = Integer.parseInt(pembagian[1]);
        int tahun = Integer.parseInt(pembagian[2]);

        String bulanHuruf = "";

        switch (bulan) {
            case 1:
                bulanHuruf = "Januari";
                break;
            case 2:
                bulanHuruf = "Februari";
                break;
            case 3:
                bulanHuruf = "Maret";
                break;
            case 4:
                bulanHuruf = "April";
                break;
            case 5:
                bulanHuruf = "Mei";
                break;
            case 6:
                bulanHuruf = "Juni";
                break;
            case 7:
                bulanHuruf = "Juli";
                break;
            case 8:
                bulanHuruf = "Agustus";
                break;
            case 9:
                bulanHuruf = "September";
                break;
            case 10:
                bulanHuruf = "Oktober";
                break;
            case 11:
                bulanHuruf = "November";
                break;
            case 12:
                bulanHuruf = "Desember";
                break;
        
            default:
                return "Inputan tidak valid";
        }
        String tahunKonversi = "";
        if (tahun >= 00 && tahun <= 23) {
            tahunKonversi = "20" + String.format("%02d", tahun);
        } else if (tahun >= 24 && tahun <= 99) {
            tahunKonversi = "19" + String.format("%02d", tahun);
        } else {
            return "Inputan tidak valid";
        }
        return hari + " " + bulanHuruf + " " + tahunKonversi;
    }
}
