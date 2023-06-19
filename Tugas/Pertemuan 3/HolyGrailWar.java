import java.util.Scanner;

public class HolyGrailWar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data servant 1
        System.out.print("Nama Servant: ");
        String namaServant1 = input.next();
        System.out.print("Class Servant: ");
        String classServant1 = input.next();
        System.out.print("Power Servant: ");
        double powerServant1 = input.nextDouble();
        System.out.print("Jumlah Quartz: ");
        double jumlahQuartzS1 = input.nextDouble();
        System.out.print("Jumlah Gacha: ");
        int jumlahGacha1 = input.nextInt();
        

        // Input data servant 2
        System.out.print("Nama Servant: ");
        String namaServant2 = input.next();
        System.out.print("Class Servant: ");
        String classServant2 = input.next();
        System.out.print("Power Servant: ");
        double powerServant2 = input.nextDouble();
        System.out.print("Jumlah Quartz: ");
        double jumlahQuartzS2 = input.nextDouble();
        System.out.print("Jumlah Gacha: ");
        int jumlahGacha2 = input.nextInt();
        
        input.close();

        Servant Servant1 = new Servant(namaServant1, classServant1, powerServant1, jumlahQuartzS1);
        Servant Servant2 = new Servant(namaServant2, classServant2, powerServant2, jumlahQuartzS2);
       
        Servant1.Detail();
        Servant2.Detail();

        Servant1.gacha(jumlahGacha1*2400);
        Servant2.gacha(jumlahGacha2*2400);


        Servant1.Detail();
        Servant2.Detail();

        Servant1.battle(Servant2);
        Servant2.battle(Servant1);

        Servant1.Detail();
        Servant2.Detail();
    }
}
