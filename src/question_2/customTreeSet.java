package question_2;

import java.util.TreeSet;

public class customTreeSet {

    TreeSet<Character> union = new TreeSet<>();
    TreeSet<Character> intersection  = new TreeSet<>();

    public void unionMethod(TreeSet<Character> characters1, TreeSet<Character> characters2){
        // solution 1
        for (Character chars: characters1) {
            union.add(chars);
        }
        for (Character chars: characters2) {
            union.add(chars);
        }
        System.out.println(union);
        // solution 2
        /* // equals above code
        union.addAll(characters1);
        union.addAll(characters2);
        System.out.println(union);*/
    }

    public void intersectionMethod(TreeSet<Character> characters1, TreeSet<Character> characters2){
        // solution 1
        /*for (Character chars: characters1) {
            intersection.add(chars);
        }
        intersection.retainAll(characters2);
        System.out.println(intersection);*/

        // solution 2
        //System.out.println(characters1.retainAll(characters2));

        // solution 3
        Integer size1 = characters1.size();
        Integer size2 = characters1.size();
        Character [] chars1 = new Character[size1];
        Character [] chars2 = new Character[size2];
        chars1 = characters1.toArray(chars1);
        chars2 = characters2.toArray(chars2);
        for (int i = 0; i < characters1.size(); i++){
            for (int j = 0; j < characters2.size(); j++){
                if(chars1[i] == chars2[j])
                    intersection.add(chars1[i]);
            }
        }
        System.out.println(intersection);
    }



}
