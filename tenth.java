import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    int price;
    int stock;

    Product(String n, int p, int s) {
        name = n;
        price = p;
        stock = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }

    void purchase(int units) {
        if (units > stock) {
            System.out.println("Insufficient stock");
            return;
        }
        stock -= units;
        System.out.println(units + " purchased of item " + name);
    }

    void ship(int units) {
        if (units > stock) {
            System.out.println("Insufficient stock");
            return;
        }
        stock -= units;
        System.out.println(units + " shipped of item " + name);
    }

    void balanceStock() {
        System.out.println("Stock of " + name + " is " + stock);
    }

    // Calculate loss/profit based on purchase price and selling price
    void calculateProfitLoss(int units, int sellingPrice) {
        int costPrice = price * units;
        int revenue = sellingPrice * units;
        int profitLoss = revenue - costPrice;

        if (profitLoss >= 0) {
            System.out.println("Profit: " + profitLoss);
        } else {
            System.out.println("Loss: " + (-profitLoss));
        }
    }
}

public class tenth {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 70000, 200);
        Product iphone = new Product("iPhone 16 Pro Max", 1000000, 9000);
        Product headPhones = new Product("Headphones", 9000, 800);

        ArrayList<Product> list = new ArrayList<>();
        list.add(laptop);
        list.add(headPhones);
        list.add(iphone);

        Scanner sc = new Scanner(System.in);
        String name;
        int price, stock;

        System.out.println("Enter product name:");
        name = sc.nextLine();
        System.out.println("Enter price:");
        price = sc.nextInt();
        System.out.println("Enter stock:");
        stock = sc.nextInt();

        Product pr = new Product(name, price, stock);
        list.add(pr);

        int choice;
        do {
            System.out.println("----------------WELCOME---------------");
            System.out.println("Enter 1 to display all products");
            System.out.println("Enter 2 for a particular product");
            System.out.println("Enter 3 to purchase an item");
            System.out.println("Enter 4 to ship an item");
            System.out.println("Enter 5 to check balance of a stock");
            System.out.println("Enter 6 to exit");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    for (Product pro : list) {
                        pro.display();
                    }
                    break;

                case 2:
                    System.out.println("Enter name of product");
                    String hel = sc.nextLine();
                    int f = 0;
                    for (Product pro : list) {
                        if (pro.name.equals(hel)) {
                            System.out.println("It's present ");
                            f = 1;
                            pro.display();
                        }
                    }
                    if (f == 0) {
                        System.out.println("Product not found");
                    }
                    break;

                case 3:
                    System.out.println("Enter name of product");
                    String hell = sc.nextLine();
                    System.out.println("Enter units to purchase:");
                    int items = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    int fr = 0;
                    for (Product pro : list) {
                        if (pro.name.equals(hell)) {
                            System.out.println("It's present ");
                            fr = 1;
                            pro.purchase(items);
                        }
                    }
                    if (fr == 0) {
                        System.out.println("Product not found");
                    }
                    break;

                case 4:
                    System.out.println("Enter name of product");
                    String hell1 = sc.nextLine();
                    System.out.println("Enter units to ship:");
                    int items1 = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    int fr1 = 0;
                    for (Product pro : list) {
                        if (pro.name.equals(hell1)) {
                            System.out.println("It's present ");
                            fr1 = 1;
                            pro.ship(items1);
                        }
                    }
                    if (fr1 == 0) {
                        System.out.println("Product not found");
                    }
                    break;

                case 5:
                    System.out.println("Enter name of product");
                    String hell2 = sc.nextLine();
                    int fr2 = 0;
                    for (Product pro : list) {
                        if (pro.name.equals(hell2)) {
                            System.out.println("It's present ");
                            fr2 = 1;
                            pro.balanceStock();
                        }
                    }
                    if (fr2 == 0) {
                        System.out.println("Product not found");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 6);

        sc.close();
    }
}
