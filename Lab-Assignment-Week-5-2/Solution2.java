import java.util.*;
public class Solution2 {
    private static StringBuilder insertSpaces(String sentence, int[] spaces) {
       // COMPLETE
	   // HINT: Use StringBuilder
       StringBuilder newSentence = new StringBuilder();
       for(int i = 0; i < spaces.length; i++) {
            String subStr = new String();
            if(i == 0){
                subStr = sentence.substring(i, spaces[i]);
            } else if(i != spaces.length - 1) {
                subStr = sentence.substring(spaces[i - 1], spaces[i]);
            } else {
                subStr = sentence.substring(spaces[i]);
            }
            newSentence.append(subStr);
            newSentence.append(" ");
            
       } 
       return newSentence;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String sentence = sc.nextLine();
            int N = sc.nextInt();
            int[] spaces = new int[N];
            for (int i = 0; i < N; i++) {
                spaces[i] = sc.nextInt();
            }
            System.out.println(insertSpaces(sentence, spaces));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
