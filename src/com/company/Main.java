package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageAndDegree(10,40));
        System.out.println(ageAndDegree(25,29));
        System.out.println(ageAndDegree(30,35));
        System.out.println(ageAndDegree(19,20));
        System.out.println(ageAndDegree(46,30));

    }

    public static int ageAndDegree(int age, int degree){
        if (age > 20 && age < 46 && degree > -20 && degree < 30)
            System.out.println("Можно идти гулять");
        else if (age < 20 && degree < 28)
            System.out.println("Можно идти гулять");
        else if (age > 45 && degree > -10 && degree < 25)
            System.out.println("Можно идти гулять");
        else System.out.println("Оставайтесь дома");
        return age;
    }
}
