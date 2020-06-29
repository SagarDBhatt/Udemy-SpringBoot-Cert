package com.onslearning.Controller;

import com.onslearning.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Initially, I used @Controller annotation but it could not capture products class.
 * So I need to change annotation to "@RestController" to resolve the issue.
 *
 * Another approach: Use "@Controller" & "@ResponseBody" annotation to solve the isses.
 */
@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String loadProducts(Model model){

        //System.out.println("Product List : " + productService.loadAllProducts());

        model.addAttribute("prod",productService.loadAllProducts());

        return "product";
    }
}
