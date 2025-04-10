package io.github.bhoomi0506.shopkart.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//REST - REpresentational State Transfer
//JSON - JavaScript Object Notation

@RestController
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    //CREATE - POST
    @PostMapping("/product/add")

        public Product addProduct(@RequestBody Product product){
        productService.addproduct(product);
        return product;

    }
    //READ - GET

    //UPDATE - PUT

    //DELETE - DELETE

    //REQUEST - HTTP METHOD & URL

    //RESPONSE - HTTP STATUS & RESPONSE BODY
}


