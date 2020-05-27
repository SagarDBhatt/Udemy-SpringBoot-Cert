package com.onslearning.Services;

import com.onslearning.domain.Product;
import com.sun.tools.javac.util.List;

public interface ProductService {

    List<Product> loadAllProducts();

}
