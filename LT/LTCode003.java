class Solution {
    public int myAtoi(String s) {
        // Trim leading whitespace
        s = s.trim();
        
        // If the string is empty after trimming, return 0
        if (s.isEmpty()) {
            return 0;
        }
        
        int sign = 1; // Default sign is positive
        int i = 0;
        long result = 0; // Use long to prevent overflow during calculations
        
        // Check for sign
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        
        // Convert digits to integer
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            i++;
            
            // Handle overflow and underflow
            if (result > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        
        // Apply the sign and return the result within the bounds
        return (int) (sign * result);
    }
}

public class LTCode003 {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        // Test cases
        System.out.println(s.myAtoi("42")); // Output: 42
        System.out.println(s.myAtoi(" -042")); // Output: -42
        System.out.println(s.myAtoi("1337c0d3")); // Output: 1337
        System.out.println(s.myAtoi("0-1")); // Output: 0
        System.out.println(s.myAtoi("words and 987")); // Output: 0
        System.out.println(s.myAtoi("21474836460")); // Output: 2147483647 (Overflow)
        System.out.println(s.myAtoi("-2147483649")); // Output: -2147483648 (Underflow)
    }
}