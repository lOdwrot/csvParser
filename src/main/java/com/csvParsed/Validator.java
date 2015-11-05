package com.csvParsed;

/**
 * Created by lodwr on 05.11.2015.
 */
public class Validator {
    private static boolean checkPhonePropierty(String number)
    {
        char[] numb=number.toCharArray();
        if (numb.length!=9)
           return false;

        if (numb[0]=='0')
            return false;

        for(char c:numb)
        {
            if (!(c>='0'&&c<='9'))
                return false;
        }
        return true;
    }
    public static boolean check(User u) {
        if(checkPhonePropierty(u.phone))
            return true;
        return false;
    }
}
