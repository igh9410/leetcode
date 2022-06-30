import java.util.*;
class Solution {
    public int reverse(int x) {
        String intToString = Integer.toString(x);
        String result = "";
        int n = intToString.length();
        if (intToString.charAt(0) == '-')
        {
            result += "-";
            if (intToString.charAt(n-1) == '0')
            {
               for (int i = n - 2; i > 0; i--)
               {
                  result += intToString.charAt(i);
               }
            }
            else
            {
            
                for (int i = n - 1; i > 0; i--)
                {
                    result += intToString.charAt(i);
                }
            }
        }
        else
        {
            if (intToString.charAt(n-1) == '0')
            {
                if (n == 1)
                    return 0;
                for (int i = intToString.length() - 2; i >= 0; i--)
                {
                    result += intToString.charAt(i);
                }

            }
            else
            { 
                for(int i = intToString.length() - 1; i >= 0; i--)
                {
                    result += intToString.charAt(i);
                }
            }
        }
        System.out.println(result);
        if (Long.parseLong(result) > Integer.MAX_VALUE || Long.parseLong(result) < Integer.MIN_VALUE)
            return 0;
        return Integer.parseInt(result);
        
        }
    
    }
