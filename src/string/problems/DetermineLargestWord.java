package string.problems;


import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
/*
    // simple method :
    public static void main(String[] args) {


        String s = "Human brain is a biological learning machine";
        String[] words = s.split(" ");

        int maxlength = 0;
        String largestword = "";

        for (int i = 0; i<words.length;i++) {
            if (words[i].length()>maxlength){
                maxlength = words[i].length();
                largestword = words[i];
            }
        }

        System.out.println(maxlength + " "+ largestword);

    }
}

 */


// method requested:

    public static void main(String[] args) {

        // Implement to Find the length and longest word in the given sentence below.
        // Should return "10 biological".


        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        System.out.println(wordNLength);
    }


    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement

        String[] words = wordGiven.split(" ");

        int wordNLength = 0;
        String largestword = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > wordNLength) {
                wordNLength = words[i].length();
                largestword = words[i];
            }
        }
        map.put(wordNLength, largestword);

        return map;

    }
}



