package org;

import java.util.Scanner;

public class readCsvFile {
    public static void read()
    {
        int numbers[9],i=0;
        Scanner csv = new Scanner(new File("Book01.csv"));
        csv.useDelimiter(",");
        while (csv.hasNext())
            {
                numbers[i]=csv.next();
                i++;
            }
        sc.close();
    }
}