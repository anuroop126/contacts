package com.nerdyworks.anuroop.contacts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by anuroop on 1/29/2016.
 */
public class Storage {
    private String name;
    private String number;
    private File f;
    public void writeData(String name,String number){
        try {
            f = new File("test.txt");
            f.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(f));
            out.write(name+"&"+number);
            out.newLine();
            out.close();
        } catch (IOException e) {}
    }

    public String getData(){
        try {
            BufferedReader in = new BufferedReader(new FileReader("file.txt"));
            String temp = in.readLine();
            in.close();
            return temp;
        } catch (IOException e) {}
    return null;
    }
}
