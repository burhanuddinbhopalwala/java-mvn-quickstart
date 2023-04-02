package org.example.patterns.gof.behavioral.iterator;

public class ProductIterator implements Iterator {
    private final Product[] products;
    private int count;

    public ProductIterator(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return this.products.length < count || this.products[count] == null;
    }

    @Override
    public Product next() {
        if (hasNext())
            return products[count++];
        return null;

    }
}
