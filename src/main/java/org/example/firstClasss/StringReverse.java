package org.example.firstClasss;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {
    public static String reverse(String s){
        List<String> tempList = new ArrayList<>(s.length());
        for(int i = 0; i < s.length(); i++){
            tempList.add(s.substring(i, i + 1));
        }
        StringBuilder reversedString = new StringBuilder(s.length());
        for(int i = tempList.size() - 1; i >= 0; i--){
            reversedString.append(tempList.get(i));
        }
        return reversedString.toString();
    }
}
