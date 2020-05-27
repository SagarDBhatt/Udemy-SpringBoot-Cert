package com.onslearning.Controller;

import com.onslearning.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/product")
    public String loadProducts(Model model){

        model.addAttribute("product", productService.loadAllProducts());
        return "product";
    }
}
