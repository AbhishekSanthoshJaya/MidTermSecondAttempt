import java.util.ArrayList;

public class MidTermSecondAttempt {
    public static void main(String[] args) {
        String[] main = new String[]{"Weeeeee are the champions"};
        String main2 = "WWWWWWWWWWWWWWWWWWWWWWWWWWee are the champions";
        MidTermSecondAttempt obj1 = new MidTermSecondAttempt();
        // for (int i = 0; i < main.length; i++) {
        //System.out.println(obj1.reverseSentence(main[i]));
        // }
        //System.out.println(obj1.mostFrequent(main2));
        System.out.println(binaryToDecimal("1000"));
    }

    public String reverseSentence(String s) {
           /* //ArrayList<String> newWords= new ArrayList<>();
            char[] t = s.toCharArray();
            String newWords = "";
            for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
                char temp = t[i];
                t[i] = t[j];
                t[j] = temp;
            }
            String finalString = new String(t);
            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < t.length; j++) {
                    if (t[j] == ' ') {
                        newWords = finalString.substring(i, j);
                    }
                }
            }
            return newWords; */

        String[] newWords = s.split(" ");
        String finalString = "";
        for (int i = newWords.length - 1; i >= 0; i--) {
            finalString += " " + newWords[i];
        }
        return finalString;
    }

    public char mostFrequent(String s) {
        char[] t = s.toCharArray();
        int i = 0;
        int[] count = new int[200];
        int max = 0;
        for (i = 0; i <= t.length; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i] == t[j]) {
                    max = count[i];
                    count[i]++;
                    if (count[i] > max) {
                        max = count[i];
                    }
                }
            }
        }
        return s.charAt(max);
    }

    public static int binaryToDecimal(String s) {
        if (s == null) {
            return 0;
        }
        char[] binNumbers = s.toCharArray();
        int power = 0;
        int result = 0;
        for (int i = binNumbers.length - 1; i >= 0; i--) {
            int charValue = Integer.parseInt(s.valueOf(binNumbers[i]));
            result += charValue * Math.pow(2, power);
            power++;
        }
        return result;

    }
}