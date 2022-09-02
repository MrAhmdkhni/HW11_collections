package question_1;

import java.util.*;

public class Permutation {

    static HashSet<String> values = new HashSet<>();
    
    static void permute(String word, String answer)
    {
        if (word.length() == 0) {
            values.add(answer);
            return;
        }
        for(int i = 0 ;i < word.length(); i++) {
            char charAt = word.charAt(i);
            String left_substr = word.substring(0, i);
            String right_substr = word.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + charAt);
        }
    }

    public static void checkTwoString(String stringOne, String stringTwo){
        if (stringOne.length() != stringTwo.length()){
            System.out.println("Fail");
        }
        else if ( values.contains(stringTwo) ){
            System.out.println("Pass");
        }else
            System.out.println("Fail");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, HashSet> permutations = new HashMap<>();

        String answer="";
        String word;
        String checkString;

        System.out.println("enter the key of map: ");
        while (true) {
            if (input.hasNextInt()) {
                System.out.println("please enter letter: ");
                input.next();
            } else {
                word = input.next();
                System.out.print("All possible strings are: ");
                permute(word, answer);
                permutations.put(word, values);
                System.out.println("Values: " + permutations.get(word));
                System.out.println("enter number for check:");
                checkString = input.next();
                checkTwoString(word, checkString);
                break;
            }
        }
    }
}

/*
    public void checkTwoString(String stringOne, String stringTwo){
        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            ArrayList<String> temp = (ArrayList<String>) iterator.next();
            temp
        }
        for (String strings : values ){
            if(stringOne.length() != strings.length()){
                System.out.println("Fail");
            }

        }
    }*/




/*char [] charArray1 = stringOne.toCharArray();
        char [] charArray2 = stringTwo.toCharArray();
        for(int i = 0 ; i < charArray1.length; i++){
            for(int j = 0 ; j < charArray2.length; j++){
                if(charArray1[i] == charArray2[j]){
                    System.out.println("Fail");
                }else System.out.println("Pass");
            }
        }*/


