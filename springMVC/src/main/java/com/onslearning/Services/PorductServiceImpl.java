package com.onslearning.Services;

import com.onslearning.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PorductServiceImpl implements ProductService {

    private Map<Integer,Product> products;

    public PorductServiceImpl() {
        loadProducts();
    }

    @Override
    public List<Product> loadAllProducts() {
        return new ArrayList<>(products.values());
    }

    private void loadProducts(){
        products = new HashMap<>();

        Product product1 = new Product();

        product1.setId(1);
        product1.setDescription(" Product 1");
        product1.setPrice(100.25);
        product1.setImageURL("http://exaple.com/product1");

        products.put(1,product1);

        Product product2 = new Product();

        product2.setId(2);
        product2.setDescription("Product 2");
        product2.setPrice(200.0);
        product2.setImageURL("http://example.com/product2");

        products.put(2,product2);
    }




}
