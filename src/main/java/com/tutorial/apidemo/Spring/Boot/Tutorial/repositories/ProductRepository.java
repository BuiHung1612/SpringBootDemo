package com.tutorial.apidemo.Spring.Boot.Tutorial.repositories;

import com.tutorial.apidemo.Spring.Boot.Tutorial.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
