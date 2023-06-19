import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void  card() {
        System.out.println("-".repeat(18)+"CARD"+"-".repeat(18));
        System.out.println(this.getName());
        System.out.printf("$%d%n",this.getBalance());
        System.out.println("-".repeat(40));
    }
}

class Product {
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

class Store {
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

        System.out.println("\n0. Keluar");
    }

    public void addProduct(Product product) {
        this.product.add(product);
    }
}

public class Beli {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        User user = new User("Me", 200000);

        ArrayList<Product> produk = new ArrayList<>();
        produk.add(new Product("Samsung Galaxy S23 Ultra", 23000, 1));
        produk.add(new Product("Asus ROG Phone 5", "23k", 3));
        produk.add(new Product("Asus VivoBook S14/S15", 10000, 8));
        
        Store BlaComp = new Store("Bla Computer", produk);
        BlaComp.addProduct(new Product("MacBook Air", "20k", 3));

        
        while (true) {
            user.card();
            BlaComp.displayproduct();
            System.out.print("> ");
            int pilihan = input.nextInt();

            if(pilihan > BlaComp.getProduct().size()) {
                System.out.println("-".repeat(40));
                System.out.println("Not in option!!");

            } else if ( 1<= pilihan && pilihan <= produk.size()) {
                System.out.println("-".repeat(40)); // garis
                System.out.println("Are you sure want to buy this:");
                System.out.printf("%s, with Price $%d%n", BlaComp.getProduct().get(pilihan - 1).getNamaBarang(), BlaComp.getProduct().get(pilihan - 1).getPrice());
                System.out.println("-".repeat(40));

                while (true) {
                    System.out.printf("1. Confirm%n2. Cancel%n");
                    System.out.print("> ");
                    int confirm = input.nextInt();

                    if (confirm == 1 && user.getBalance() >= BlaComp.getProduct().get(pilihan - 1).getPrice()) {
                        System.out.printf("%s successful buy out %s.%n", user.getName(), BlaComp.getProduct().get(pilihan - 1).getNamaBarang());
                        user.setBalance((user.getBalance() - BlaComp.getProduct().get(pilihan - 1).getPrice()));
                        System.out.println(user.getBalance());
                        System.out.println(BlaComp.getProduct().get(pilihan - 1).getPrice());
                        
                        System.out.println("-".repeat(40));
                        System.out.printf("Go to the next transaction%n1. Yes%n2. No%n");
                        System.out.print("> ");
                        int pilihan2 = input.nextInt();

                        if (pilihan2 == 1) {
                            break;

                        } else {
                            System.out.println("Thank You!!");
                            System.exit(0);
                        }

                    } else if (confirm == 2) {
                        break;

                    } else {
                        System.out.println("-".repeat(40));
                        System.out.printf("Information : Your Balance = $%d | Price list = $%d | %s%n", user.getBalance(), BlaComp.getProduct().get(pilihan - 1).getPrice(), (user.getBalance() < BlaComp.getProduct().get(pilihan - 1).getPrice()) ? "Insufficient Balance" : "Input correctly!!");
                        break;
                    }
                }

            } else {
                System.out.println("Thank You!!");
                break;
            }
        }

        input.close();
    }   
}