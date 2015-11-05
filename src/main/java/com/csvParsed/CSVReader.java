package com.csvParsed;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by lodwr on 05.11.2015.
 */
public class CSVReader {
    public static ArrayList<User> read(String inputPath){
        ArrayList<User> u= new ArrayList<>();
        BufferedReader br = null;
        String line = "";
        String splitSign = ",";

        try {
            br = new BufferedReader(new FileReader(inputPath));
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] splitedLine=line.split(splitSign);
                u.add(new User(splitedLine[0],splitedLine[1],splitedLine[2],splitedLine[3]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return u;
    }
}
