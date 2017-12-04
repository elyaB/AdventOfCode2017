package com.example.AdventCalendar.Year2017;

import java.util.ArrayList;
import java.util.List;

public class Day1 {
    public static Integer resolveCaptcha(String str) {

        return sumOfDigits(
                listOfDigitsThatMatches(
                        convertStrToIntegerArray(str)
                )
        );
    }


    private static List<Integer> listOfDigitsThatMatches(Integer[] numbers) {

        List<Integer> numbersThatMatches = new ArrayList<Integer>();

            for (Integer j = 1; j <= numbers.length ; j++) {

                if(j == numbers.length){
                    if (numbers[j-1].equals(numbers[0])){
                        numbersThatMatches.add(numbers[j-1]);
                    }
                } else if (numbers[j-1].equals(numbers[j])){
                    System.out.println(numbers[j-1]);
                    numbersThatMatches.add(numbers[j-1]);
                }
            }


        return numbersThatMatches;
    }

    private static Integer[] convertStrToIntegerArray(String str) {
        Integer[] intObjectArray = new Integer[str.length()];
        for (int i=0; i<str.length(); i++) {
            intObjectArray[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        return intObjectArray;
    }

    private static Integer sumOfDigits(List<Integer> listOfIntegers) {
        Integer result = 0;

        for (Integer number: listOfIntegers) {
            result += number;
        }
        return result;

    }
}
