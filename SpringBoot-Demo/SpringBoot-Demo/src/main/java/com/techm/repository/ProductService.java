package com.techm.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long nextId = 1;

    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(Long id) {
        Optional<Product> optionalProduct = products.stream().filter(p -> p.getId().equals(id)).findFirst();
        return optionalProduct.orElse(null);
    }

    public Product updateProduct(Product updatedProduct) {
        Optional<Product> optionalProduct = products.stream().filter(p -> p.getId().equals(updatedProduct.getId())).findFirst();
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            return product;
        } else {
            return null;
        }
    }

    public boolean deleteProduct(Long id) {
        return products.removeIf(p -> p.getId().equals(id));
    }
}
