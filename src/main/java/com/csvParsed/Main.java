package com.csvParsed;

import com.config.ConfigService;
import com.config.Keys;

import java.util.ArrayList;
import java.util.Properties;

/**
 * Created by lodwr on 05.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        CSVTranformator trnsformator = new CSVTranformator();
        trnsformator.transform();
        /*ConfigService config = new ConfigService("D:\\Studia\\csvParser\\src\\main\\resources\\config");
        ArrayList<User> users = CSVReader.read(config.getProperty(Keys.FILE_INPUT));
        users=ArrayOperator.deleteDuplicates(users);
        ArrayOperator.sort(users);
        ArraySplitter.splitAndWrite(ArraySplitter.splitCorrect(users),Integer.parseInt(config.getProperty(Keys.ROWS)),"correctData");*/
    }
}
