package com.csvParsed;

import java.lang.reflect.Array;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Created by lodwr on 05.11.2015.
 */
public class ArraySplitter {
    public static ArrayList<User> splitCorrect(ArrayList<User> users){
        ArrayList<User> correct = new ArrayList<User>();
        ArrayList<User> incorrect = new ArrayList<User>();
        for (User u:users){
            if(Validator.check(u))
                correct.add(u);
            else incorrect.add(u);
        }
       CSVWriter.generateCSVfile(incorrect,"Errors",0);
        return correct;
    }
    private static ArrayList<User> splitFromIndexToIndex(int from,int to,ArrayList<User> users)
    {
        if(from>=to)
            return null;
        ArrayList<User> u = new ArrayList<User>();
        for(;from<to;from++)
        {
            u.add(users.get(from));
        }
        return u;
    }
    public static void splitAndWrite(ArrayList<User> users, int packSize, String basicName)
    {
        int i=0;
        int packageLimit=0;
        int previousLimit=0;
        do{
            if(packageLimit+packSize<(users.size()-1))
                packageLimit+=packSize;
            else packageLimit=(users.size()-1);
            ArrayList<User> pack=splitFromIndexToIndex(previousLimit, packageLimit, users);
            CSVWriter.generateCSVfile(pack,basicName,i);
            i++;
            previousLimit=packageLimit;


        }while(packageLimit!=(users.size()-1));

    }
}
