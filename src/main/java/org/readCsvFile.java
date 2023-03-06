package org;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readCsvFile {
    protected List<Integer> read() {
        List<Integer> numbers=new ArrayList<>();
        int i=0;
        try {
            Scanner csv = new Scanner(new File(System.getProperty("user.dir")+"/src/main/java/org/Book1.csv"));
            Scanner data = csv.useDelimiter(";|\r?\n|\r");
            while (data.hasNext()) {
                numbers.add(i, Integer.valueOf(data.next()));
                i++;
            }
            csv.close();
        } catch (Exception e) {
            //TODO add a logger
        }
        return numbers;
    }
}