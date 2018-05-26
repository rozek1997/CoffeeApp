package com.example.coffeeworld.Repository;

import com.example.coffeeworld.POJO.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    public User findUserByNickname(String nickname);

}
