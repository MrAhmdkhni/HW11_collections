package question_2;

import java.util.Random;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        customTreeSet testTreeSet = new customTreeSet();
        TreeSet<Character> characters1 = new TreeSet<>();
        TreeSet<Character> characters2 = new TreeSet<>();
        Random random = new Random();

        // solution 1
        for(int i = 0; i < 10; i++){
            if( ! characters1.add((char) random.nextInt(97, 123)) ){
                i--;
            }
        }

        // solution 2
        /*while (characters1.size() != 10){
            characters1.add((char) random.nextInt(97, 123));
        }*/

        for(int i = 0; i < 10; i++){
            if( ! characters2.add((char) random.nextInt(97, 123)) ){
                i--;
            }
        }
        System.out.println(characters1);
        System.out.println(characters2);
        testTreeSet.unionMethod(characters1, characters2);
        testTreeSet.intersectionMethod(characters1,characters2);

    }
}
