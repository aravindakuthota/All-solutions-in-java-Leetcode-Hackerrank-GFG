import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        
        
        
        
         int[] count = new int[26];

        // Count characters from both strings
        for (int i = 0; i <s1.length(); i++) {
            count[s1.charAt(i) - 'a']++; // increase for string a
            count[s2.charAt(i) - 'a']--; // decrease for string b
        }

        // If all counts are 0, strings are anagrams
        for (int c : count) {
            if (c != 0) {
               System.out.println("Not Anagrams");
            }
        }
       System.out.println("Anagrams");
    }
       
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
