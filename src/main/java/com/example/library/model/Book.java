package com.example.library.model;

public record Book(long id, String title, String author){
    public Book{
        if(id <= 0){
            throw new IllegalArgumentException("Book ID must be postive");
        }
        title = requireText(title,"Title");
        author = requireText(author,"Author");
    }
    private static String requireText(String value, String label){
        if(value.isBlank() || value == null){
            throw new IllegalArgumentException(label + "Cannot be empty");
        }
        return value.strip();
    }
}