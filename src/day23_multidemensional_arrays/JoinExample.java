package day23_multidemensional_arrays;

import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {
        /*
        Arrays.toString (arrName);
        Arrays.equals (arr1, arr2);
        Arrays.sort(arrName);

        String str = "java";
        str.toCharArray();
        str.split("str");

        String str = new String (arrName);
         */

        String[] words = {"a", "b", "c"};
        System.out.println(Arrays.toString(words));

        //Output: a-b-c
        String result = "";

        for (String eachWord : words) {
            result += eachWord + "-";
            //System.out.println(eachWord + "-");
        }
        String result2 = "";
        for (int i = 0; i < words.length; i++) {
            result2 += words[i] + "-";
            if (i == words.length - 1) {
                break;
            }
            result2 += "-";
        }
        System.out.println(result2);


        //System.out.println(result.substring(0, result.length()-1));
        System.out.println("================================");
        //with. join () method

        System.out.println(String.join("-", words));
        System.out.println(String.join("&", words));
        System.out.println(String.join("======", words));
        System.out.println(String.join("       ", words));
        System.out.println(String.join("", words));


        // You can assign join to String
        String str2 = String.join("*", words);

        System.out.println("================================");
        char [] arr = {'a', 'b', 'c'};
        String str = new String (arr);
        System.out.println(str);


    }
    }

