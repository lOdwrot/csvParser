package com.csvParsed;

import com.config.ConfigService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by lodwr on 05.11.2015.
 */
public class CSVWriter {
    public static void generateCSVfile(ArrayList<User> users,String name, int numb)
    {

        ConfigService c = new ConfigService("D:\\Studia\\csvParser\\src\\main\\resources\\config");
        StringBuilder builder = new StringBuilder();
        String p=builder.append(c.getProperty("outputFilename")).append(name).append('_').append(users.size()).append('_').append(numb).append(".csv").toString();

        try
        {
            FileWriter writer = new FileWriter(p);

            writer.append("Name");
            writer.append(',');
            writer.append("Surname");
            writer.append(',');
            writer.append("City");
            writer.append(',');
            writer.append("Phone");
            writer.append('\n');

            for(User user: users)
            {
                writer.append(user.name);
                writer.append(',');
                writer.append(user.surname);
                writer.append(',');
                writer.append(user.city);
                writer.append(',');
                writer.append(user.phone);
                writer.append('\n');
            }

            //generate whatever data you want

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
