package com.company;

public class Main {

    private static String home;

    public static void main(String[] args) {
        System.out.println(ageAndDegree(50, -30));
        System.out.println(ageAndDegree(12,20));
        System.out.println(ageAndDegree(25,28));
        System.out.println(ageAndDegree(35,-40));
        System.out.println(ageAndDegree(40,55));





    }

    public static  String ageAndDegree(int age, int degree){
        if (age > 20 && age < 46 && degree > -20 && degree < 30){
            return "Можно гулять!";
        } else if (age < 20 && degree < 28){
        return "Можно идти гулять";
        } else if (age > 45 && degree > -10 && degree < 25){
            return "Гуляй смело";
        }else{
            String home = ("Оставайтесь дома");
            return home;}

    }
}