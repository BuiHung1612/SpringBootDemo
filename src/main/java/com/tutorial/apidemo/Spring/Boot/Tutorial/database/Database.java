package com.tutorial.apidemo.Spring.Boot.Tutorial.database;

import com.tutorial.apidemo.Spring.Boot.Tutorial.models.Product;
import com.tutorial.apidemo.Spring.Boot.Tutorial.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {
    private static final Logger logger = LoggerFactory.getLogger(Database.class);

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                            Product ProductA =  new Product("Realme Q2",2021,4550000.0,"undefined");
                            Product ProductB =  new Product("Realme Q3 Pro",2021,4990000.0,"undefined");

                            logger.info("Insert ProductA:"+productRepository.save(ProductA));
                            logger.info("Insert ProductB:"+productRepository.save(ProductB));



            };
        };
    }

}
