package question_4;

public class Main {

    public static void main(String[] args) {
        CustomHashMap<Integer, String> customHashMap = new CustomHashMap();

        System.out.println(customHashMap.isEmpty());
        customHashMap.put(1, "Amir");
        customHashMap.put(2, "Arsha");
        customHashMap.put(3, "Mahdi");
        customHashMap.put(4, "reza");
        customHashMap.put(4, "Roham");
        //customHashMap.replace(4, "Hamed");
        //customHashMap.replace(9, "Hamed");
        //customHashMap.replace(2, "Arsha", "Saeed");
        System.out.println(customHashMap.isEmpty());
        System.out.println(customHashMap.containsKey(3));
        System.out.println(customHashMap.containsValue("Amir"));
        System.out.println(customHashMap.containsValue("amir"));
        System.out.println(customHashMap);
    }
}
