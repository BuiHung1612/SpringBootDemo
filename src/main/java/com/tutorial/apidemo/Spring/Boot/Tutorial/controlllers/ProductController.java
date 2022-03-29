package com.tutorial.apidemo.Spring.Boot.Tutorial.controlllers;


import com.tutorial.apidemo.Spring.Boot.Tutorial.models.Product;
import com.tutorial.apidemo.Spring.Boot.Tutorial.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {

    // DI = Dependency Injection
    @Autowired
    private ProductRepository repository;



    @GetMapping("")
    List<Product> getAllProducts(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    Optional<Product> findById(@PathVariable Long id){
        return repository.findById(id);
    }
}
