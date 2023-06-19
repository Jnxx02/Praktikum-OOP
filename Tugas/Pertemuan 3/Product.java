public class Product {
    private String namaBarang;
    private int price, stock;

    public Product() {
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getPrice() {
        return price;
    }


    public int getStock() {
        return stock;
    }

    public Product (String namaBarang, int price, int stock) {
        this.namaBarang = namaBarang;
        this.stock = stock;
        this.price = price;
    }

    public Product (String namaBarang, String price, int stock) {
        this.namaBarang = namaBarang;
        this.stock = stock;
        this.price = Integer.parseInt(price.substring(0, price.length() - 1) + "000");
    }

    public void checkStock(Store store) {
        this.stock--;
        if (this.stock == 0) {
            store.getProduct().remove(this);
        }
    }
}
