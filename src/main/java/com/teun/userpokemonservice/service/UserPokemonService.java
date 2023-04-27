package com.teun.userpokemonservice.service;

import com.teun.userpokemonservice.model.UserPokemon;
import com.teun.userpokemonservice.repo.UserPokemonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPokemonService {

    @Autowired
    UserPokemonRepo repo;

    public List<UserPokemon> findAllByUserId(Long userId){
        return repo.findByUserId(userId);
    }
    public UserPokemon saveUserPokemon(UserPokemon userPokemon){
        UserPokemon savedUserPokemon = repo.save(userPokemon);
        return savedUserPokemon;
    }
}
