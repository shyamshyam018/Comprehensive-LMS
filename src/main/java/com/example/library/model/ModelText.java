package com.example.library.model;

final class ModelText {
    private ModelText(){}
    static String requireText(String value, String label){
            if(value == null || value.isBlank()){
                throw new IllegalArgumentException(label + " cannot be blank");
            }
            return value.strip();
    }
}
