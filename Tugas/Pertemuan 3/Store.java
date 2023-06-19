import java.util.ArrayList;

public class Store {
    private String namaToko;
    private ArrayList<Product> product;

    public Store() {
    }

    public String getNamaToko() {
        return namaToko;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public Store(String namaToko, ArrayList<Product> product) {
        this.namaToko = namaToko;
        this.product = product;
    }

    public void displayproduct() {
        int i = 1;
        System.out.printf("\nSelamat Datang di %s\nDaftar Produk:", this.namaToko);

        for (Product product : this.product) {
            System.out.printf("\n%d. %s - $%d | Stok %d", i, product.getNamaBarang(), product.getPrice(), product.getStock());
            i++;
        }

        System.out.println("0. Keluar");
    }

    public void addProduct(Product product) {
        this.product.add(product);
    }
}