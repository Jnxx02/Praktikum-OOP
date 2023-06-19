public class Product {
    String nama;
    int id;
    double harga;

    public Product(String nama, int id, double harga) {
        this.nama = nama;
        this.id = id;
        this.harga = harga;
    }
}

class Toko {
    int stok;
    Product[] daftarBarang;

    public Toko(Product[] daftarBarang) {
        this.daftarBarang = daftarBarang;
    }
}

class Check {
    public static void main(String[] args) {
        
        Product pd1 = new Product("Acer", 2000, 1);
        Product pd2 = new Product("Acer", 2000, 1);
        Product pd3 = new Product("Acer", 2000, 1);
        Product pd4 = new Product("Acer", 2000, 1);
        Product pd5 = new Product("Acer", 2000, 1);
        Product[] daftarBarang = {pd1,pd2,pd3,pd4,pd5};
        Toko tk = new Toko(daftarBarang);
        System.out.println(tk.daftarBarang);
    }
}