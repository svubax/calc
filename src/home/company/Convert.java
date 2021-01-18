package home.company;

import java.util.HashMap;
import java.util.TreeMap;

public class Convert {

    public static String toRoman(int number) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        String roman = "";
        while (number != 0){
            int i = map.floorKey(number);
            roman += map.get(i);
            number -= i;
        }
        return roman;
    }
    public static Integer romeToArab(String number){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);
        return map.getOrDefault(number, 0);
    }
    public static Integer arabToArab(String number){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);
        map.put("10", 10);
        return map.getOrDefault(number, 0);
    }
}
