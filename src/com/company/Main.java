package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageAndDegree(25,24));


    }

    public static String ageAndDegree(int age, int degree){
        String result = "";
        if (age > 20 && age < 46 && degree > -20 && degree < 30)
            System.out.println("Можно идти гулять");
        else if (age < 20 && degree < 28)
            System.out.println("Можно идти гулять");
        else if (age > 45 && degree > -10 && degree < 25)
            System.out.println("Можно идти гулять");
        else System.out.println("Оставайтесь дома");
        return result;
    }
}
