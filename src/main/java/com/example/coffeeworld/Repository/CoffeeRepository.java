package com.example.coffeeworld.Repository;

import com.example.coffeeworld.POJO.Coffee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoffeeRepository extends MongoRepository<Coffee, String> {
}
