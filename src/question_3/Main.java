package question_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NeatCouple neatCouple = new NeatCouple();
        ArrayList<Integer> numbers = new ArrayList<>();

                    // TODO: 8/31/2022 self check

        System.out.println("How many numbers do you want to add to the list?");
        Integer repeat = input.nextInt();
        if( repeat != 0) {
            System.out.println("enter numbers: ");
        }
        for (int i = 0; i < repeat; i++){
            Integer number = input.nextInt();
            numbers.add(number);
        }
        neatCouple.removeNumbers(numbers);

        /*numbers.add(5);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(6);
        numbers.add(9);
        numbers.add(9);
        removeNumbers(numbers);*/

        /*ArrayList<Integer> ss = new ArrayList<>();
        ss.add(5);
        ss.add(3);
        ss.add(5);
        ss.add(7);
        ss.add(6);
        ss.add(9);
        System.out.println(ss.size());
        try {
            System.out.println(ss.get(ss.size()));
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.fillInStackTrace());
        }
        System.out.println(ss.get(ss.size() - 1));*/

    }
}
