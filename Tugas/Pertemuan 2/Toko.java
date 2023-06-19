import java.util.Scanner;

public class Toko {
    String nama;
    int id, stok;
    double harga;

    public void Produk(int id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public double getHarga() {
        return harga;
    }

    public boolean tersedia() {
        return stok > 0;
    }
}

class Check {
    public static void main(String[] args) {
        Toko cek = new Toko();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama barang: ");
        String nama = input.nextLine();
        System.out.print("Masukkan ID barang: ");
        int id = input.nextInt();
        System.out.print("Masukkan Stok barang: ");
        int stok = input.nextInt();
        System.out.print("Masukkan Harga barang: ");
        double harga = input.nextDouble();
        input.close();

        System.out.printf("ID: %d\nNama: %s\nStok: %d\nHarga: %.3f\nTersedia? %b", id, nama, stok, harga, cek.tersedia());
    }
}