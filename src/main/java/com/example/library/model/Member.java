package com.example.library.model;

import java.util.Locale;

public record Member(long id, String name, String email){
    public Member{
        if(id <= 0){
            throw new IllegalArgumentException("ID should be positive");
        }
        name = ModelText.requireText(name,"Name");
        email = ModelText.requireText(email,"Email").toLowerCase(Locale.ROOT);
    }
}