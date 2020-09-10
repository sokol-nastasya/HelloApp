package com.company;

public class Pet {
    int age;
    float weight;
    float height;
    String color;


    public void sleep(){
        System.out.println("Good night");
    }

    public void eat(){
        System.out.println("Lets go eat :) ");
    }

    public String say(String word){
        String petRespone = "OK!" + word;
        return petRespone;
    }

}
