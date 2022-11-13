import java.util.regex.*;
class Solution {
    public String reverseWords(String s) {
  
        String[] result = s.split("\\s+");
        
        /* for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        } */
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = result.length - 1; i > 0; i--) {
            sb.append(result[i] + " ");
        }
        sb.append(result[0]);     

        
        return sb.toString().trim();
    }
}