package com.csvParsed;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lodwr on 05.11.2015.
 */
public class ArrayOperator {
    public static ArrayList<User> deleteDuplicates(ArrayList<User> users)
    {
        ArrayList<User> unique = new ArrayList<User>();
        Set<User> hs = new HashSet<User>();
        hs.addAll(users);
        unique.addAll(hs);
        return unique;
    }
    public static void sort(ArrayList<User> users){
        users.sort((p1, p2) -> p1.compareTo(p2));
    }

}
