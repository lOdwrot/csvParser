package com.csvParsed;

import com.config.ConfigService;
import com.config.Keys;

import java.util.ArrayList;

/**
 * Created by lodwr on 05.11.2015.
 */
public class CSVTranformator {
    ArrayList<User> users;
    ConfigService config;
    public CSVTranformator(){
        config = new ConfigService("D:\\Studia\\csvParser\\src\\main\\resources\\config");
        loadNewCSV(config.getProperty(Keys.FILE_INPUT));
    }
    public void transform()
    {
        users=ArrayOperator.deleteDuplicates(users);
        ArrayOperator.sort(users);
        ArraySplitter.splitAndWrite(ArraySplitter.splitCorrect(users),Integer.parseInt(config.getProperty(Keys.ROWS)),"correctData");
    }
    public void loadNewCSV(String path)
    {
        users = CSVReader.read(path);
    }
}
