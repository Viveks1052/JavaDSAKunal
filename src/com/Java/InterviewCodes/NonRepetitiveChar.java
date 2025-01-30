package com.Java.InterviewCodes;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepetitiveChar {

    public static void main(String[] args) {

        String s = "Vivek";
        String NewString = s.toLowerCase();
        System.out.println(NewString);
        int length = NewString.length();
        char[] ch = new char[length];
        for(int i = 0; i<ch.length; ++i){
            ch[i] = NewString.charAt(i);
            System.out.println(ch[i]);
        }
        List<Character> charList = new ArrayList<>();
        for (char c : ch) {
            charList.add(c);
        }

        System.out.println(charList);

        Map<Character, Long> CharCountMap = charList.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

        System.out.println(CharCountMap);

        // find first non-repetitive character we have to use entrySet() as it will be iterating

        Optional<Character> FirstValue= CharCountMap.entrySet().stream().filter(entry ->entry.getValue()==1).map(Map.Entry::getKey).findFirst();

        FirstValue.ifPresentOrElse(
                Ch -> System.out.println("First non-repetitive character: " + Ch),
                () -> System.out.println("No non-repetitive character found")
        );

    }
}
