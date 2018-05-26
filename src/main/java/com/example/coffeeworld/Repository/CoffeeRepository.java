package com.example.coffeeworld.Repository;

import com.example.coffeeworld.POJO.Coffee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CoffeeRepository extends MongoRepository<Coffee, String> {


    public List<Coffee> findAllByUserID(String userID);

    public Coffee findCoffeeByCoffeeName(String coffeeName);


}
