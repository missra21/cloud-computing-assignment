package com.sap.controller;

import com.sap.dtos.response.DemoApplicationResponse;
import com.sap.entities.Product;
import com.sap.exceptions.NotFoundException;
import com.sap.service.ProductService;
import com.sap.util.Constants;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("product")
public class ProductController {

    final ProductService productService;

    @GetMapping("")
    public ResponseEntity<DemoApplicationResponse<List<Product>>> getUsers() {
        List<Product> products = productService.getAllProducts();
        if (null == products || products.isEmpty()) {
            return DemoApplicationResponse.noContent();
        }
        return DemoApplicationResponse.ok(products);
    }


    @GetMapping("/{id}")
    public ResponseEntity<DemoApplicationResponse<Product>> getProduct(@PathVariable Long id) {
        try {
            return DemoApplicationResponse.ok(productService.getProductById(id));
        } catch (NotFoundException e) {
            return DemoApplicationResponse.badRequest(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<DemoApplicationResponse<String>> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        productService.updateProduct(product);
        return DemoApplicationResponse.created("Product Updated successfully");
    }


    @PostMapping("")
    public ResponseEntity<DemoApplicationResponse<String>> addUser(@RequestBody Product product) {
        productService.saveProduct(product);
        return DemoApplicationResponse.created("Product Added successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DemoApplicationResponse<Product>> deleteUser(@PathVariable Long id) {
        productService.deleteProduct(id);
        return DemoApplicationResponse.notFound(Constants.ResponseMessages.USER_DELETED);
    }

}
