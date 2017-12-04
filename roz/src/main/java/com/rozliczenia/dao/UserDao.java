package com.rozliczenia.dao;

import com.rozliczenia.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class UserDao {

    @Autowired
    EntityManager entityManager;

    public User findByEmail(String email){

        return null;
    }
}
