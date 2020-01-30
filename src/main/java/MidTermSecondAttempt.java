import java.util.ArrayList;

public class MidTermSecondAttempt {
    public static void main(String[] args) {
        String[] main = new String[]{"Welcome to Canada"};
        MidTermSecondAttempt obj1 = new MidTermSecondAttempt();
        for (int i = 0; i < main.length; i++) {
            System.out.println(obj1.reverseSentence(main[i]));
        }
    }
        public String reverseSentence (String s){
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
           for(int i = newWords.length-1; i >=0; i--){
               finalString += " " + newWords[i];
           }
           return finalString;
        }
    }
