package com.arcproject.arcproject.interfaces;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arcproject.arcproject.entities.UserDoc;

@Repository
public interface UserInterface extends MongoRepository<UserDoc, String> {
    UserDoc findByEmail(String email);
    UserDoc findByUuid(String uuid);
}
