package com.example.AdventCalendar.Year2017;

import sun.misc.Regexp;

import java.util.regex.Pattern;

public class Day2 {

    public static void split(){
        String string = "0938   023883    52353 234234";
        Pattern pattern = Pattern.compile("\\s");
        String[] parts = string.split("\\s");
        for (String part: parts) {
            System.out.println(part);
        }
    }
}
