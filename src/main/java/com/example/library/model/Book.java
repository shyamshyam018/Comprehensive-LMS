package com.example.library.model;

public record Book(long id, String title, String author){
    public Book{
        if(id <= 0){
            throw new IllegalArgumentException("Book ID must be positive");
        }
        title = ModelText.requireText(title,"Title");
        author = ModelText.requireText(author,"Author");
    }
}