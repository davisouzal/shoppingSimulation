package br.ufal.ic.p2.shopping;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Sport T-Shirt", 159.9);
        Product p2 = new Product("Adidas Sneakers", 299.9);

        Customer c1 = new Customer(1, "John Doe", "Av. Brazil, 1000");
        Customer c2 = new Customer(2, "Jane da Lage", "Av. England, 2000");
        Customer c3 = new Customer(3, "Jack Spearow", "Av. Germany, 3000");

        ShoppingCart sc1 = new ShoppingCart(c1);
        ShoppingCart sc2 = new ShoppingCart(c2);
        ShoppingCart sc3 = new ShoppingCart(c3);

        sc1.addProduct(p1);
        sc1.addProduct(p2);

        System.out.println(sc1.getTotal());
        System.out.println(sc1.getContent());
    }
}
