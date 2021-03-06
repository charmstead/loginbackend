package com.example.demo.service;

import com.example.demo.model.DataOwner;

import java.util.List;

public interface DataOwnerService {

    List<DataOwner> getAllUsers();

    List<DataOwner> getUserByEmail(String email);
    List<DataOwner> getUserByUsername(String username);


    DataOwner createUser(DataOwner user);

    DataOwner setUserPoint(long userId, int point);
    DataOwner getUserById(long id);


}
