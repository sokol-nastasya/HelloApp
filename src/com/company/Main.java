package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Curl, curl");
        System.out.println(petReaction);
        myPet.sleep();


//        System.out.print("Hello World\n");
//        double MyScore = 5;
//        String s = "Sum";
//        MyScore*=2;
//        MyScore++;
//        MyScore/=3;
//        System.out.println(s + " " + MyScore);



//        int a = 10;
//        String s = " «Слава Роботам! Убить всех человеков!»";
//        for(int i=0; i<a; i++){
//            System.out.print(s);
//        }
    }
}
