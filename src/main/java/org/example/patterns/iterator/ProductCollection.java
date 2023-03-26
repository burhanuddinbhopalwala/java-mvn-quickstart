package org.example.patterns.iterator;

public class ProductCollection implements Collection {
    private final Product[] products;
    private int count = 0;

    public ProductCollection(Product[] products) {
        this.products = new Product[10];
    }

    public void addProduct(Product product) {
        this.products[count++] = product;
    }

    @Override
    public ProductIterator createIterator() {
        return new ProductIterator(products);
    }
}
