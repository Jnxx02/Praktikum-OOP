import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan judul film\t:");
        String kalimat = input.nextLine();
        String kapital = awalanKapital(kalimat);
        System.out.println(kapital);
        input.close();
    }
    public static String awalanKapital(String kalimat) {
        String[] kata = kalimat.split("\\s");
        StringBuilder kapital = new StringBuilder();

        for(String kata2 : kata){
            String hurufKapital = kata2.substring(0, 1).toUpperCase() + kata2.substring(1).toLowerCase();
            kapital.append(hurufKapital).append(" ");
        }
        return kapital.toString().trim();
    }
}
