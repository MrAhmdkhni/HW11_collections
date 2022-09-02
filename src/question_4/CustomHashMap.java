package question_4;

import java.util.ArrayList;

public class CustomHashMap<K, V> {

    ArrayList<K> keys = new ArrayList<>();
    ArrayList<V> values = new ArrayList<>();

    public void put(K key, V value){
        if( ! keys.contains(key) ) {
            keys.add(key);
            values.add(value);
        } else {
            int indexOfKey = keys.indexOf(key);
            values.remove(indexOfKey);
            values.add(indexOfKey, value);
        }
    }

    public V replace(K key, V value){
        if( keys.contains(key) ) {
            int indexOfKey = keys.indexOf(key);
            values.remove(indexOfKey);
            values.add(indexOfKey, value);
            return value;
        }
        return null;
    }

    public boolean replace(K key, V oldValue, V newValue){
        int indexOfKey = keys.indexOf(key);
        if ( keys.contains(key) && oldValue == values.get(indexOfKey) ){
            values.remove(indexOfKey);
            values.add(indexOfKey, newValue);
            return true;
        }
        return false;
    }

    public boolean containsKey(K key){
        return keys.contains(key);
    }

    public boolean containsValue(V value){
        return values.contains(value);
    }

    public boolean isEmpty(){
        return keys.isEmpty() && values.isEmpty();
    }

    /*@Override
    public String toString() {
        return "CustomHashMap{" +
                "keys = " + keys +
                ", values = " + values +
                '}';
    }*/
    @Override
    public String toString() {
        String strTemp = "";
        for(int i = 0; i < keys.size(); i++){
            strTemp += "{ " + keys.get(i) + " = [" +values.get(i) + "] }";
        }
        return strTemp;
    }

}

