package com.example.coffeeworld.Repository;

import com.example.coffeeworld.POJO.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * account repository
 */
@Repository
public interface AccountRepository extends MongoRepository<Account, String> {

    public Optional<Account> findUserByUsername(String username);

}
