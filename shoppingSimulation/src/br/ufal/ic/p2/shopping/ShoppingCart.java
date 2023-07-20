package br.ufal.ic.p2.shopping;

import java.util.ArrayList;

public class ShoppingCart {

    private Customer customer;
    private ArrayList<Product> products;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public String getContent() {
        String content = "";
        for (Product product : products) {
            content += product.getName() + "\n";
        }
        return content;
    }

    public int getCustomerID() {
        return customer.getId();
    }

    public int getNumberOfProducts() {
        return products.size();
    }

    public double getTotal() {
        double total = 0;
        for (Product product : this.products) {
            total += product.getPrice();
        }
        return total;
    }

}
