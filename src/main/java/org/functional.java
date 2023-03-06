package org;

import java.util.List;

public class functional {

    public List<Integer> sortData() {
        return ascendingNum(readData());
    }

    private List<Integer> readData(){
        readCsvFile readCsvFile = new readCsvFile();
        return readCsvFile.read();

    }

    private List<Integer> ascendingNum(List<Integer> num) {
        List<Integer> numbers;
        numbers = num;
        for (int i=0;i<num.size();i++) {
            for(int j=i+1;j<num.size();j++)
            {
                 if(numbers.get(i)<numbers.get(j)){
                     int x=numbers.get(i);
                     numbers.add(i,numbers.get(j));
                     numbers.add(j,x);
                 }
            }
        }
        return numbers;
    }

}