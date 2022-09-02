package question_3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NeatCouple {

    public void removeNumbers(ArrayList<Integer> integers){
        if(integers.isEmpty()){
            System.out.println(integers);
        }
        else {
            if (integers.size() % 2 != 0) {
                integers.remove(integers.size() - 1);
            }
            for (int i = 0; i <= integers.size() - 1;) {
                if (integers.get(i) > integers.get(i + 1)) {
                    integers.remove(i);
                    integers.remove(i);
                }
                else i +=2;
            }
            System.out.println(integers);
        }
    }
}
