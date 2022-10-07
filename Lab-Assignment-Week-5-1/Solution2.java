// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

class Solution2 {
  
  	public static char[] cipher(String str, int n) {
        char[] en = str.toCharArray();
        String st = "abcdefghijklmnopqrstuvwxyz"; // index from 0 to 25
        char[] s = st.toCharArray();
        int index = 0;

        for(int i = 0; i < en.length; i++) {
            // linear search character of en from in s
            for(int j = 0; j < s.length; j++) {
                if(en[i] == s[j]) {
                    index = j;
                    break;
                }
            }
            
            // encrypt the string
            if(index + n > 25) {
                en[i] = s[index + n - 26];
            } else {
                en[i] = s[index + n];
            }
        }

        return en;
    }  

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String str;
            int n;

            // read string and integer n
            str = in.next();
            n = in.nextInt();

            System.out.println(cipher(str, n));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}