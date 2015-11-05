package com.csvParsed;

import java.util.Random;

/**
 * Created by lodwr on 05.11.2015.
 */
public class SampleData {
    private static String names[] = {"Bogdan","Andrzej","Aneta"};
    private static String surname[] = {"Aaaa","Bbbbbb", "Cccccc"};
    private static String city[] = {"Budapeszt", "Stalingrad", "Warszawa"};
    private static Random generator = new Random();
    public static String getName(){
        return names[generator.nextInt(names.length)];
    }
    public static String getCity(){
        return names[generator.nextInt(city.length)];
    }
    public static String getSurname(){
        return surname[generator.nextInt(surname.length)];
    }
    public static String getPhone()
    {
        StringBuilder builder= new StringBuilder();
        for(int i =0;i<9;i++)
        builder.append(generator.nextInt(10));

        return builder.toString();
    }
    public static User getSampleUser(){
        User u = new User();
        u.name=getName();
        u.surname=getSurname();
        u.city=getCity();
        u.phone =getPhone();
        return u;
    }

}
