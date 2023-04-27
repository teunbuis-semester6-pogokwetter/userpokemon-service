package com.teun.userpokemonservice.repo;

import com.teun.userpokemonservice.model.UserPokemon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPokemonRepo extends MongoRepository<UserPokemon, String> {

    List<UserPokemon> findByUserId(Long userId);
}
