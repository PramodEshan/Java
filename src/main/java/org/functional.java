package org;

import java.util.Scanner;

public class ascending {

    public static void reformatfile()
    {
        readCsvFile readcsv = new readCsvFile();
        int[] number=readcsv.read();
        ascendingnum(number);

    }

    public static void ascendingnum(int num[9])
    {
        int n;
        for (int i=0;i<10)
        {
            for(int j=i+1;j<10;j++)
            {
                if(num[i]>num[j])
                {
                    n=num[j+1];
                    num[j+1]=num[i];
                    num[i]=n;
                    i=0;
                }
            }
        }
    }
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
        return numbers;
    }
}